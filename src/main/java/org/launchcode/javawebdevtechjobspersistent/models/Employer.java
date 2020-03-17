package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(max=50, message="Location too long!")
    @NotBlank
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs=new ArrayList<>();

    public Employer(){}
    public Employer(String location){
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
