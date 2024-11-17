package br.cefetmg.mockloginapi.service;

import br.cefetmg.mockloginapi.entity.*;
import br.cefetmg.mockloginapi.dto.*;

public class EntityToDTO {

    static public UsuarioDTO ConvertUsuario(Usuario entity) {

        String departamentNome = entity.getDepartamento().getNome();

        UsuarioDTO uDTO = new UsuarioDTO(entity.getId(), entity.getNome(), entity.getCpf(),
                          entity.getSenha(), entity.getFoto(), departamentNome);

        return uDTO;

    }

    static public DepartamentoDTO ConvertDepartamento(Departamento entity) {

        DepartamentoDTO dDTO = new DepartamentoDTO(entity.getId(), entity.getNome(),
                                        entity.getTelefone(), entity.getEmail(), entity.getCampus());

        return dDTO;

    }

}
