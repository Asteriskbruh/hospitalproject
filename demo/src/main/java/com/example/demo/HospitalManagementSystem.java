package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PatientRecord")
public class HospitalManagementSystem {
    @Id
    private String ID ; 
    private String FirstName;
    private String LastName;
    private int age;
    private String gender;

    public HospitalManagementSystem(String id, String firstName, String lastName, int age, String gender) {
        this.ID = id;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public HospitalManagementSystem() {
    }

    public String getId() {
        return ID;
    }

    public void setId(String id) {
        this.ID = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "HospitalManagementSystem{" +
                "id=" + ID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}


