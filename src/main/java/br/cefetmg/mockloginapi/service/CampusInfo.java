package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dao.CampusDAO;
import br.cefetmg.mockloginapi.dao.DepartamentDAO;
import br.cefetmg.mockloginapi.dto.CampusDTO;
import br.cefetmg.mockloginapi.dto.DepartamentDTO;
import br.cefetmg.mockloginapi.entity.Campus;
import br.cefetmg.mockloginapi.entity.Departament;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CampusInfo {

    //private util
    static private EntityManager getEntityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mockpersistence");
        EntityManager em = emf.createEntityManager();

        return em;

    }

    //public getDTO
    static public CampusDTO getDTO(int id) {

        CampusDAO campusDAO = new CampusDAO();
        EntityManager em = getEntityManager();

        Campus campus = campusDAO.getById(id, em);
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO;

    }

    static public CampusDTO getDTO(String name) {

        CampusDAO campusDAO = new CampusDAO();
        EntityManager em = getEntityManager();

        Campus campus = campusDAO.getByName(name, em);
        CampusDTO campusDTO = EntityToDTO.ConvertCampus(campus);

        return campusDTO;

    }

    static public CampusDTO getDTO(Departament departament) {

        String campusName = departament.getCampus().getName();

        return getDTO(campusName);

    }

    static public CampusDTO getDTO(DepartamentDTO departamentDTO) {

        String campusName = departamentDTO.getCampus();

        return getDTO(campusName);

    }

    static public CampusDTO getDTO(String name, boolean useDepartamentInfo) {

        if (!useDepartamentInfo)
            return getDTO(name);

        CampusDAO campusDAO = new CampusDAO();
        DepartamentDAO departamentDAO = new DepartamentDAO();
        EntityManager em = getEntityManager();

        Departament departament = departamentDAO.getByName(name, em);

        return getDTO(departament);

    }

    static public CampusDTO getDTO(int id, boolean useDepartamentInfo) {

        if (!useDepartamentInfo)
            return getDTO(id);

        CampusDAO campusDAO = new CampusDAO();
        DepartamentDAO departamentDAO = new DepartamentDAO();
        EntityManager em = getEntityManager();

        Departament departament = departamentDAO.getById(id, em);

        return getDTO(departament);

    }
    
}
