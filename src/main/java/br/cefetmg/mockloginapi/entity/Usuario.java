package br.cefetmg.mockloginapi.entity;

import br.cefetmg.mockloginapi.entity.Departamento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String senha;
    private String cpf;
    private String foto;
    
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

    @Column (name = "tipo_usuario")
    private String tipoUsuario;

    //Getters
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getFoto() {
        return foto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    
}
