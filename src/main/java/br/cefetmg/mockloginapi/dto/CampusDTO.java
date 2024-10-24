package br.cefetmg.mockloginapi.dto;

import java.util.List;

public class CampusDTO {

    private int id;
    private String name;
    private String adress;
    private String contactPhone;
    private String email;
    private List<String> departaments;



    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getDepartaments() {
        return departaments;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartaments(List<String> departaments) {
        this.departaments = departaments;
    }

}
