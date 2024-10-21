package br.cefetmg.mockloginapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table (name = "usuario")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "usuarioid")
    private int id;

    @Column (name = "nome")
    private String name;
    @Column (name = "senha")
    private String password;
    @Column (name = "email")
    private String email;
    @Column (name = "cpf")
    private String cpf;
    @Column (name = "foto")
    private Blob icon;
    
    @ManyToOne
    @JoinColumn(name = "departamentoid")
    private Departament departament;

    //Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Blob getIcon() {
        return icon;
    }

    public Departament getDepartament() {
        return departament;
    }

    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIcon(Blob icon) {
        this.email = email;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
    
    
    
}
