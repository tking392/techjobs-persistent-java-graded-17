package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

@NotBlank(message = "Location required. Please enter Location.")
@Size(max = 100, message = "Field cannot exceed 100 characters.")
private String location;

@OneToMany
@JoinColumn (name = "employer_id")
private List<Job> jobs = new ArrayList<>();

    public Employer() {

    }

    public Employer(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
