package com.example.workshop01.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class MyUser {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;

    public MyUser() {
    }

    public MyUser(String name, int age) {
        this(0, name, age);
    }

    public MyUser(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}