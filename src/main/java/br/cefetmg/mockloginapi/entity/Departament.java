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
public class Departament {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "departamentoid")
    private int id;

    @JoinColumn(name = "nome")
    private String name;
    @JoinColumn(name = "telefone")
    private String contactPhone;
    @JoinColumn(name = "email")
    private String email;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "departament")
    private List<User> funcionarios;
    
    @ManyToOne
    @JoinColumn(name = "campusid")
    private Campus campus;

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public List<User> getFuncionarios() {
        return funcionarios;
    }

    public Campus getCampus() {
        return campus;
    }

    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFuncionarios(List<User> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    
}
