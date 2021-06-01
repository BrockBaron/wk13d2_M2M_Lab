package com.codeclan.employees.employeeservices.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dept_name")
    private String deptName;

    @JsonIgnoreProperties({"department"})
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(Long id, String deptName, List<Employee> employees) {
        this.id = id;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public Department() {
    }

    //GETTERS & SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
