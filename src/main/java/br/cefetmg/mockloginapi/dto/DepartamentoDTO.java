package br.cefetmg.mockloginapi.dto;

import br.cefetmg.mockloginapi.dao.DepartamentoDAO;

import java.util.List;

public class DepartamentoDTO {

    private long id;

    private String nome;
    private String telefone;
    private String email;
    private String campus;

    public DepartamentoDTO(long id, String nome, String telefone, String email, String campus) {
        setId(id);
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setCampus(campus);
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCampus() {
        return campus;
    }


    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }


}
