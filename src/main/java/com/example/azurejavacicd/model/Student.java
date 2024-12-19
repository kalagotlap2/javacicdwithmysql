package com.example.azurejavacicd.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;




@Entity
@Builder
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String name;


    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }



    public Student() {

    }

    public Student(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
