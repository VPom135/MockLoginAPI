package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dao.UsuarioDAO;
import br.cefetmg.mockloginapi.entity.Usuario;
import br.cefetmg.mockloginapi.dto.UsuarioDTO;
import br.cefetmg.mockloginapi.exceptions.IncorrectPasswordException;
import br.cefetmg.mockloginapi.exceptions.UserNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserValidation {

    public static boolean checkForUser(String name) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        UsuarioDAO uDao = new UsuarioDAO();
        Usuario u = uDao.getByName(name, em);

        return (u != null);

    }

    public static UsuarioDTO validateLogin(String login, String password) throws UserNotFoundException, IncorrectPasswordException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        UsuarioDAO uDao = new UsuarioDAO();
        Usuario u = uDao.getByName(login, em);

        if (u == null) {
            throw new UserNotFoundException("Usuário não encontrado no sistema.");
        }

        if (!u.getSenha().equals(password)) {
            throw new IncorrectPasswordException("Senha incorreta.");
        }

        return EntityToDTO.ConvertUsuario(u);

    }

}
