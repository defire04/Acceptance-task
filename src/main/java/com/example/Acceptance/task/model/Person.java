//package com.example.Acceptance.task.model;
//
//
//import com.fasterxml.jackson.annotation.JsonView;
////import jakarta.persistence.*;
//
////@Entity
//public class Person {
////    @Id
////    @Column(name = "id")
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonView(Views.IdFullName.class)
//    private int id;
//
////    @Column(name = "name")
//    @JsonView(Views.IdFullName.class)
//    private String name;
//
////    @Column(name = "surname")
//    @JsonView(Views.IdFullName.class)
//    private String surname;
//
////    @Column(name = "birth_date")
//    @JsonView(Views.WithBirthDate.class)
//    private String birthDate;
//
//
//    @JsonView(Views.WithAge.class)
//    private int age;
//
//    public Person() {
//    }
//
//    public Person(int id, String name, String surname, String birthDate) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.birthDate = birthDate;
//    }
//
//    public Person(int id, String name, String surname, String birthDate, int age) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.birthDate = birthDate;
//        this.age = age;
//    }
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getBirthDate() {
//        return birthDate;
//    }
//    public void setBirthDate(String birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
