package br.cefetmg.mockloginapi.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "departamento")
public class Departamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "departamentoid")
    private int id;
    
    private String nome;
    private String telefone;
    private String email;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "departamento")
    private List<Usuario> funcionarios;
    
    @ManyToOne
    @JoinColumn(name = "campusid")
    private Campus campus;

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

    public List<Usuario> getFuncionarios() {
        return funcionarios;
    }

    public Campus getCampus() {
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

    public void setFuncionarios(List<Usuario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    
}
