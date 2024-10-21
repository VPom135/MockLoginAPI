package br.cefetmg.mockloginapi.dto;

import java.util.List;

public class DepartamentoDTO {

    private int id;

    private String nome;
    private String telefone;
    private String email;

    private CampusDTO campus;

    //Getters
    public int getId() {
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

    public CampusDTO getCampus() {
        return campus;
    }


    //Setters
    public void setId(int id) {
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

    public void setCampus(CampusDTO campus) {
        this.campus = campus;
    }


}
