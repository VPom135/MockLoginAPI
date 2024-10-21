package br.cefetmg.mockloginapi.dto;
import br.cefetmg.mockloginapi.entity.Departamento;

public class UsuarioDTO {

    private int id;

    private String nome;
    private String cpf;
    private String senha;
    private String email;

    private DepartamentoDTO departamento;

    //Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public DepartamentoDTO getDepartamento() {
        return departamento;
    }


    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartamento(DepartamentoDTO departamento) {
        this.departamento = departamento;
    }


}
