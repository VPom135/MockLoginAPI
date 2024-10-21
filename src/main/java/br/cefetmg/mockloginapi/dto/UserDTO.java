package br.cefetmg.mockloginapi.dto;

import java.sql.Blob;
import br.cefetmg.mockloginapi.entity.Departament;

public class UserDTO {

    private int id;

    private String name;
    private String password;
    private String cpf;
    private String email;
    private Blob icon;

    private String departament;

    public UserDTO(int id, String name, String password, String cpf, String email, Blob icon, String departament) {

        setId(id);
        setName(name);
        setPassword(password);
        setCpf(cpf);
        setEmail(email);
        setIcon(icon);
        setDepartament(departament);

    }

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

    public String getDepartament() {
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

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setIcon(Blob icon) { this.icon = icon;
    }
}
