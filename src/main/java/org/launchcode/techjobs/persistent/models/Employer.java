package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

@NotBlank(message = "Location required. Please enter Location.")
@Size(max = 100, message = "Field cannot exceed 100 characters.")
private String location;

public Employer() {}

public Employer(String location) {
    this.location = location;
}

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}

}
