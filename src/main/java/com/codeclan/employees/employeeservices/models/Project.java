package com.codeclan.employees.employeeservices.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Project {




    @JsonIgnoreProperties({"project"})
    @OneToMany(mappedBy = "project")
    private List<Project> projects;

    public Project(String name, int duration, int noOfEmployees) {
        this.name = name;
        this.pirates = new ArrayList<>();
    }
}
