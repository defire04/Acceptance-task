package com.example.Acceptance.task.model;


import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(Views.IdFullName.class)
    private int id;

    @Column(name = "name")
    @JsonView(Views.IdFullName.class)
    private String name;

    @Column(name = "surname")
    @JsonView(Views.IdFullName.class)
    private String surname;

    @Column(name = "birth_date")
    @JsonView(Views.WithBirthDate.class)
    private String birthDate;


    public Person() {
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(int id, String name, String surname, String birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}
