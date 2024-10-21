package br.cefetmg.mockloginapi.dto;

import br.cefetmg.mockloginapi.entity.Campus;

public class DepartamentDTO {

    private int id;

    private String name;
    private String contactPhone;
    private String email;

    private String campus;

    public DepartamentDTO(int id, String name, String contactPhone, String email, String campus) {

        setId(id);
        setName(name);
        setContactPhone(contactPhone);
        setEmail(email);
        setCampus(campus);

    }

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

    public String getCampus() {

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

    public void setCampus(String campus) {

        this.campus = campus;

    }


}
