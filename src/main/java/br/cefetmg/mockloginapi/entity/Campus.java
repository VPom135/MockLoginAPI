package br.cefetmg.mockloginapi.entity;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "campus")
public class Campus {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "campusid")
    private int id;

    @Column (name = "nome")
    private String name;
    @Column (name = "endereco")
    private String adress;
    @Column (name = "telefone")
    private String contactPhone;
    @Column (name = "email")
    private String email;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "campus")
    private List<Departament> departaments;

    public Campus(int id, String name, String adress, String contactPhone, String email) {

        setId(id);
        setName(name);
        setAdress(adress);
        setContactPhone(contactPhone);
        setEmail(email);

    }

    public Campus(int id, String name, String adress, String contactPhone, String email, List<Departament> departaments) {

        new Campus(id, name, adress, contactPhone, email);
        setDepartaments(departaments);

    }

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

    public List<Departament> getDepartaments() {
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

    public void setDepartaments(List<Departament> departaments) {
        this.departaments = departaments;
    }
    
}
