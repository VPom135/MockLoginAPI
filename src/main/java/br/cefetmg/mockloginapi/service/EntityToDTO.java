package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.entity.*;
import br.cefetmg.mockloginapi.dto.*;

public class EntityToDTO {

    static public UsuarioDTO ConvertUsuario(Usuario entity) {

        UsuarioDTO uDTO = new UsuarioDTO(entity.getId(), entity.getNome(), entity.getEmail(),
                entity.getSenha(), entity.getCpf(), entity.getFoto(), entity.getTipoUsuario(),
                entity.getDepartamento().getNome());

        return uDTO;

    }

    static public DepartamentoDTO ConvertDepartamento(Departamento entity) {

        DepartamentoDTO dDTO = new DepartamentoDTO(entity.getId(), entity.getNome(),
                                        entity.getTelefone(), entity.getEmail(), entity.getCampus());

        return dDTO;

    }

}
