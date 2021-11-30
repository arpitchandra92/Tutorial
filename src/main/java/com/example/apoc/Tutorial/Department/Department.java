package com.example.apoc.Tutorial.Department;

import javax.persistence.*;

@Entity
@Table
public class Department {
    @Id
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_sequence"
    )
    private long did;
    private String name;
    private Integer noofcourses;

    public Department(String name, Integer noofcourses) {
        this.name = name;
        this.noofcourses = noofcourses;
    }

    public Department(long did, String name, Integer noofcourses) {
        this.did = did;
        this.name = name;
        this.noofcourses = noofcourses;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", noofcourses=" + noofcourses +
                '}';
    }

    public Department() {
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoofcourses() {
        return noofcourses;
    }

    public void setNoofcourses(Integer noofcourses) {
        this.noofcourses = noofcourses;
    }
}
