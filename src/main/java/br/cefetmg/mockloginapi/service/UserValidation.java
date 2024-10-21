package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dao.UserDAO;
import br.cefetmg.mockloginapi.dto.DepartamentDTO;
import br.cefetmg.mockloginapi.entity.Departament;
import br.cefetmg.mockloginapi.entity.User;
import br.cefetmg.mockloginapi.dto.UserDTO;
import br.cefetmg.mockloginapi.exceptions.IncorrectPasswordException;
import br.cefetmg.mockloginapi.exceptions.UserNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserValidation {

    //private util
    private static EntityManager getEntityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        return em;

    }

    //public checkForUser
    public static boolean checkForUser(String name) {

        EntityManager em = getEntityManager();

        UserDAO userDao = new UserDAO();
        User user = userDao.getByName(name, em);

        return (user != null);

    }

    //public validateLogin
    public static UserDTO validateLogin(String login, String password, boolean useNameAsLogin)
                                        throws UserNotFoundException, IncorrectPasswordException {

        EntityManager em = getEntityManager();

        UserDAO userDao = new UserDAO();
        User user;

        if(useNameAsLogin)
            user = userDao.getByName(login, em);
        else
            user = userDao.getByCpf(login, em);

        if (user == null) {
            throw new UserNotFoundException("Usuário não encontrado no sistema.");
        }

        if (!user.getPassword().equals(password)) {
            throw new IncorrectPasswordException("Senha incorreta.");
        }

        return EntityToDTO.ConvertUsuario(user);

    }

    // public getDepartamentDTO
    public static DepartamentDTO getDepartamentDTO(String name) {

        EntityManager em = getEntityManager();

        UserDAO userDAO = new UserDAO();
        User user = userDAO.getByName(name, em);
        Departament departament = user.getDepartament();

        return EntityToDTO.ConvertDepartamento(departament);

    }

    public static DepartamentDTO getDepartamentDTO(int id) {

        EntityManager em = getEntityManager();

        UserDAO userDAO = new UserDAO();
        User user = userDAO.getById(id, em);
        Departament departament = user.getDepartament();

        return EntityToDTO.ConvertDepartamento(departament);

    }

    // public getDepartament
    public static String getDepartament(String name) {

        EntityManager em = getEntityManager();

        UserDAO userDAO = new UserDAO();
        User user = userDAO.getByName(name, em);
        Departament departament = user.getDepartament();

        return departament.getName();

    }

    public static String getDepartament(int id) {

        EntityManager em = getEntityManager();

        UserDAO userDAO = new UserDAO();
        User user = userDAO.getById(id, em);
        Departament departament = user.getDepartament();

        return departament.getName();

    }

}