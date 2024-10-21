package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dto.CampusDTO;
import br.cefetmg.mockloginapi.dto.DepartamentDTO;
import br.cefetmg.mockloginapi.dto.UserDTO;
import br.cefetmg.mockloginapi.entity.Campus;
import br.cefetmg.mockloginapi.entity.Departament;
import br.cefetmg.mockloginapi.entity.User;

public class EntityToDTO {

    static public UserDTO ConvertUsuario(User entity) {

        String departamentName = entity.getDepartament().getName();

        UserDTO userDTO = new UserDTO(entity.getId(), entity.getName(), entity.getPassword(),
                          entity.getCpf(), entity.getEmail(), entity.getIcon(), departamentName);

        return userDTO;

    }

    static public DepartamentDTO ConvertDepartamento(Departament entity) {

        String campusName = entity.getCampus().getName();

        DepartamentDTO departamentDTO = new DepartamentDTO(entity.getId(), entity.getName(),
                                        entity.getContactPhone(), entity.getEmail(), campusName);

        return departamentDTO;

    }

    static public CampusDTO ConvertCampus(Campus entity) {

        CampusDTO campusDTO = new CampusDTO();

        return campusDTO;

    }

}
