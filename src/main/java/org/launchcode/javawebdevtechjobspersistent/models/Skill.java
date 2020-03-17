package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Size(max=500, message="Too long!")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    public Skill(){}
    public Skill(String description){
        super();
        this.description=description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}