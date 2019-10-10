package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=1, max=20)
    private String first_name;

    @NotNull
    @Size(min=2, max=30)
    private String last_name;

    @NotNull
    @Size(min=3, max=50)
    private String address;

    @NotNull
    @Size(min=3, max=30)
    private String city;

    @NotNull
    @Size(min=2, max=2)
    private String state;

    @NotNull
    @Size(min=5,max=5)
    private String zip;

    @NotNull
    @Size(min=3, max=100)
    private String job_title;

    @ManyToOne()
    private Department department;

    public Employee() {
    }

    public Employee(@NotNull @Size(min = 1, max = 20) String first_name,
                    @NotNull @Size(min = 2, max = 30) String last_name,
                    @NotNull @Size(min = 3, max = 50) String address,
                    @NotNull @Size(min = 3, max = 30) String city,
                    @NotNull @Size(min = 2, max = 2) String state,
                    @NotNull @Size(min = 5, max = 5) String zip,
                    @NotNull @Size(min = 3, max = 100) String job_title,
                    Department department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.job_title = job_title;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
