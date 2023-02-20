package com.example.springbootcrudtask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "is_person_studying_java")
    private Boolean PersonWhoStudiesJava;

    public User() {
    }

    public User(String name, String lastName, Boolean personWhoStudiesJava) {
        this.name = name;
        this.lastName = lastName;
        PersonWhoStudiesJava = personWhoStudiesJava;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getPersonWhoStudiesJava() {
        return PersonWhoStudiesJava;
    }

    public void setPersonWhoStudiesJava(Boolean personWhoStudiesJava) {
        PersonWhoStudiesJava = personWhoStudiesJava;
    }

    @Override
    public String toString() {
        return String.format(
            "User id = %d, firstName = '%s', lastName = '%s'",
            id, name, lastName);

    }
}
