package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.dto.CampusDTO;
import br.cefetmg.mockloginapi.dto.DepartamentoDTO;
import br.cefetmg.mockloginapi.dto.UsuarioDTO;
import br.cefetmg.mockloginapi.entity.Campus;
import br.cefetmg.mockloginapi.entity.Departamento;
import br.cefetmg.mockloginapi.entity.Usuario;

import java.util.List;

public class EntityToDTO {

    static public UsuarioDTO ConvertUsuario(Usuario entity) {

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId(entity.getId());

        usuarioDTO.setNome(entity.getNome());
        usuarioDTO.setCpf(entity.getCpf());
        usuarioDTO.setSenha(entity.getSenha());
        usuarioDTO.setEmail(entity.getEmail());

        DepartamentoDTO departamentoDTO = ConvertDepartamento(entity.getDepartamento());

        usuarioDTO.setDepartamento(departamentoDTO);

        return usuarioDTO;

    }

    static public DepartamentoDTO ConvertDepartamento(Departamento entity) {

        DepartamentoDTO departamentoDTO = new DepartamentoDTO();

        departamentoDTO.setId(entity.getId());
        departamentoDTO.setNome(entity.getNome());
        departamentoDTO.setTelefone(entity.getTelefone());
        departamentoDTO.setEmail(entity.getEmail());

        CampusDTO campusDTO = ConvertCampus(entity.getCampus());

        departamentoDTO.setCampus(campusDTO);

        return departamentoDTO;

    }

    static public CampusDTO ConvertCampus(Campus entity) {

        CampusDTO campusDTO = new CampusDTO();

        campusDTO.setId(entity.getId());
        campusDTO.setNome(entity.getNome());
        campusDTO.setEndereco(entity.getEndereco());
        campusDTO.setTelefone(entity.getTelefone());
        campusDTO.setEmail(entity.getEndereco());

        return campusDTO;

    }

}
