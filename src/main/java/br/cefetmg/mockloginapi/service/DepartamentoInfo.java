package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dto.*;
import br.cefetmg.mockloginapi.dao.*;
import br.cefetmg.mockloginapi.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartamentoInfo {

    //private util
    static private EntityManager getEntityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        return em;

    }

    //public getDTO
    static public DepartamentoDTO getDTO(int id) {

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        EntityManager em = getEntityManager();

        Departamento departamento = departamentoDAO.getById(id, em);
        DepartamentoDTO dDTO = EntityToDTO.ConvertDepartamento(departamento);

        return dDTO;

    }

    static public DepartamentoDTO getDTO(String name) {

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        EntityManager em = getEntityManager();

        Departamento departamento = departamentoDAO.getByName(name, em);
        DepartamentoDTO dDTO = EntityToDTO.ConvertDepartamento(departamento);

        return dDTO;

    }

    static public DepartamentoDTO getDTO(Usuario user) {

        String departamentoName = user.getDepartamento().getNome();

        return getDTO(departamentoName);

    }

    static public DepartamentoDTO getDTO(UsuarioDTO userDTO) {

        String departamentoName = userDTO.getDepartamento();

        return getDTO(departamentoName);

    }

    static public DepartamentoDTO getDTO(String name, boolean useUsuarioInfo) {

        if (!useUsuarioInfo)
            return getDTO(name);

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        UsuarioDAO userDAO = new UsuarioDAO();
        EntityManager em = getEntityManager();

        Usuario user = userDAO.getByName(name, em);

        return getDTO(user);

    }

    static public DepartamentoDTO getDTO(int id, boolean useUsuarioInfo) {

        if (!useUsuarioInfo)
            return getDTO(id);

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        UsuarioDAO userDAO = new UsuarioDAO();
        EntityManager em = getEntityManager();

        Usuario user = userDAO.getById(id, em);

        return getDTO(user);

    }

    //public getInfo
    static public String getInfo(int id) {

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        EntityManager em = getEntityManager();
        Departamento departamento = departamentoDAO.getById(id, em);

        return departamento.toString();
        
    }
    static public String getInfo(String name) {

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        EntityManager em = getEntityManager();
        Departamento departamento = departamentoDAO.getByName(name, em);

        return departamento.toString();

    }
    static public String getInfo(Usuario user) {

        String departamentoName = user.getDepartamento().getNome();

        return getInfo(departamentoName);

    }
    static public String getInfo(UsuarioDTO userDTO) {

        String departamentoName = userDTO.getDepartamento();

        return getInfo(departamentoName);

    }
    static public String getInfo(String name, boolean useUsuarioInfo) {

        if (!useUsuarioInfo)
            return getInfo(name);

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        UsuarioDAO userDAO = new UsuarioDAO();
        EntityManager em = getEntityManager();

        Usuario user = userDAO.getByName(name, em);

        return getInfo(user);

    }
    static public String getInfo(int id, boolean useUsuarioInfo) {

        if (!useUsuarioInfo)
            return getInfo(id);

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        UsuarioDAO userDAO = new UsuarioDAO();
        EntityManager em = getEntityManager();

        Usuario user = userDAO.getById(id, em);

        return getInfo(user);

    }

}
