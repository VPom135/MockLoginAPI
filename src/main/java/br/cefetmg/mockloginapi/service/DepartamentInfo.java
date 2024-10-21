package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dao.CampusDAO;
import br.cefetmg.mockloginapi.dao.DepartamentDAO;
import br.cefetmg.mockloginapi.dao.UserDAO;
import br.cefetmg.mockloginapi.dto.CampusDTO;
import br.cefetmg.mockloginapi.dto.DepartamentDTO;
import br.cefetmg.mockloginapi.dto.UserDTO;
import br.cefetmg.mockloginapi.entity.Campus;
import br.cefetmg.mockloginapi.entity.Departament;
import br.cefetmg.mockloginapi.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartamentInfo {

    //private util
    static private EntityManager getEntityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        return em;

    }

    //public getDTO
    static public DepartamentDTO getDTO(int id) {

        DepartamentDAO departamentDAO = new DepartamentDAO();
        EntityManager em = getEntityManager();

        Departament departament = departamentDAO.getById(id, em);
        DepartamentDTO departamentDTO = EntityToDTO.ConvertDepartamento(departament);

        return departamentDTO;

    }

    static public DepartamentDTO getDTO(String name) {

        DepartamentDAO departamentDAO = new DepartamentDAO();
        EntityManager em = getEntityManager();

        Departament departament = departamentDAO.getByName(name, em);
        DepartamentDTO departamentDTO = EntityToDTO.ConvertDepartamento(departament);

        return departamentDTO;

    }

    static public DepartamentDTO getDTO(User user) {

        String departamentName = user.getDepartament().getName();

        return getDTO(departamentName);

    }

    static public DepartamentDTO getDTO(UserDTO userDTO) {

        String departamentName = userDTO.getDepartament();

        return getDTO(departamentName);

    }

    static public DepartamentDTO getDTO(String name, boolean useUserInfo) {

        if (!useUserInfo)
            return getDTO(name);

        DepartamentDAO departamentDAO = new DepartamentDAO();
        UserDAO userDAO = new UserDAO();
        EntityManager em = getEntityManager();

        User user = userDAO.getByName(name, em);

        return getDTO(user);

    }

    static public DepartamentDTO getDTO(int id, boolean useUserInfo) {

        if (!useUserInfo)
            return getDTO(id);

        DepartamentDAO departamentDAO = new DepartamentDAO();
        UserDAO userDAO = new UserDAO();
        EntityManager em = getEntityManager();

        User user = userDAO.getById(id, em);

        return getDTO(user);

    }

    //public getInfo
    static public String getInfo(int id) {

        DepartamentDAO departamentDAO = new DepartamentDAO();
        EntityManager em = getEntityManager();
        Departament departament = departamentDAO.getById(id, em);

        return departament.toString();
        
    }

    static public String getInfo(String name) {

        DepartamentDAO departamentDAO = new DepartamentDAO();
        EntityManager em = getEntityManager();
        Departament departament = departamentDAO.getByName(name, em);

        return departament.toString();

    }

    static public String getInfo(User user) {

        String departamentName = user.getDepartament().getName();

        return getInfo(departamentName);

    }

    static public String getInfo(UserDTO userDTO) {

        String departamentName = userDTO.getDepartament();

        return getInfo(departamentName);

    }

    static public String getInfo(String name, boolean useUserInfo) {

        if (!useUserInfo)
            return getInfo(name);

        DepartamentDAO departamentDAO = new DepartamentDAO();
        UserDAO userDAO = new UserDAO();
        EntityManager em = getEntityManager();

        User user = userDAO.getByName(name, em);

        return getInfo(user);

    }

    static public String getInfo(int id, boolean useUserInfo) {

        if (!useUserInfo)
            return getInfo(id);

        DepartamentDAO departamentDAO = new DepartamentDAO();
        UserDAO userDAO = new UserDAO();
        EntityManager em = getEntityManager();

        User user = userDAO.getById(id, em);

        return getInfo(user);

    }


    //public getDepartamentCampusDTO
    static public CampusDTO getDepartamentCampusDTO(String name) {

        CampusDAO dao = new CampusDAO();
        EntityManager em = getEntityManager();

        Campus campus = dao.getByName(name, em);
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO;

    }

    static public CampusDTO getDepartamentCampusDTO(int id) {

        CampusDAO dao = new CampusDAO();
        EntityManager em = getEntityManager();

        Campus campus = dao.getById(id, em);
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO;

    }
    static public CampusDTO getDepartamentCampusDTO(Departament departament) {

        Campus campus = departament.getCampus();
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO;

    }

    static public CampusDTO getDepartamentCampusDTO(DepartamentDTO departamentDTO) {

        String campusName = departamentDTO.getCampus();

        return getDepartamentCampusDTO(campusName);

    }


    //public getDepartamentCampusName
    static public String getDepartamentCampusName(String name) {

        CampusDAO dao = new CampusDAO();
        EntityManager em = getEntityManager();

        Campus campus = dao.getByName(name, em);
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO.getName();

    }

    static public String getDepartamentCampusName(int id) {

        CampusDAO dao = new CampusDAO();
        EntityManager em = getEntityManager();

        Campus campus = dao.getById(id, em);
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO.getName();

    }

    static public String getDepartamentCampusName(Departament departament) {

        Campus campus = departament.getCampus();
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO.getName();

    }

    static public String getDepartamentCampusName(DepartamentDTO departamentDTO) {
        
        return departamentDTO.getCampus();

    }

}
