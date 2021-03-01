package com.ml.StorageApi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dentists")
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dentist")
    private int idDentist;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String address;
    private int dni;
    @Column(name = "birth_date")
    private Date birthDate;
    private String phone;
    private String email;
    @Column(name = "code_mp")
    private String codeMp;
    @OneToMany(mappedBy = "dentist")
    private List<Diary> diaries;

    public int getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(int idDentist) {
        this.idDentist = idDentist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodeMp() {
        return codeMp;
    }

    public void setCodeMp(String codeMp) {
        this.codeMp = codeMp;
    }
}