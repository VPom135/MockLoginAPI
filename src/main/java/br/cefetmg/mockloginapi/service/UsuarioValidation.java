package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.exceptions.*;
import br.cefetmg.mockloginapi.entity.*;
import br.cefetmg.mockloginapi.dto.*;
import br.cefetmg.mockloginapi.dao.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuarioValidation {

    //private util
    private static EntityManager getEntityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        return em;

    }

    //public checkForUsuario
    public static boolean checkForUsuario(String nome) {

        EntityManager em = getEntityManager();
        UsuarioDAO userDao = new UsuarioDAO();
        Usuario user = userDao.getByName(nome, em);

        return (user != null);

    }

    //public validateLogin
    public static UsuarioDTO validateLogin(String login, String senha, boolean useNomeAsLogin)
            throws InvalidLoginCredentialsException {

        EntityManager em = getEntityManager();

        UsuarioDAO userDao = new UsuarioDAO();
        Usuario user;

        if(useNomeAsLogin)
            user = userDao.getByName(login, em);
        else
            user = userDao.getByCpf(login, em);

        if (user == null) {
            throw new InvalidLoginCredentialsException();
        }

        if (!user.getSenha().equals(senha)) {
            throw new InvalidLoginCredentialsException();
        }

        return EntityToDTO.ConvertUsuario(user);

    }

    public static UsuarioDTO validateLogin(String login, String senha)
            throws InvalidLoginCredentialsException {

        return validateLogin(login, senha, false);

    }

    // public getDepartamentoDTO
    public static DepartamentoDTO getDepartamentoDTO(String nome) {

        EntityManager em = getEntityManager();

        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user = userDAO.getByName(nome, em);
        Departamento departament = user.getDepartamento();

        return EntityToDTO.ConvertDepartamento(departament);

    }

    public static DepartamentoDTO getDepartamentoDTO(int id) {

        EntityManager em = getEntityManager();

        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user = userDAO.getById(id, em);

        Departamento departament = user.getDepartamento();

        return EntityToDTO.ConvertDepartamento(departament);

    }

    // public getDepartamento
    public static String getDepartamento(String nome) {

        EntityManager em = getEntityManager();

        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user = userDAO.getByName(nome, em);
        Departamento departament = user.getDepartamento();

        return departament.getNome();

    }

    public static String getDepartamento(int id) {

        EntityManager em = getEntityManager();

        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user = userDAO.getById(id, em);
        Departamento departament = user.getDepartamento();

        return departament.getNome();

    }

}