package com.example.userregistrationapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String cpf;
    private String email;
    private String phone;

    public User() {}
    public User(String name, String cpf, String email, String Phone){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = Phone;
    }

    public int getId(){return id;}
    public void setId(int id) {this.id= id;}
    public String getName(){return name;}
    public String getCPF(){return cpf;}
    public String getEmail(){return email;}
    public String getPhone(){return phone;}
}
