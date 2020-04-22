package com.galbern.budget.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Customers")
public class Customer extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="proj_id", nullable=false)
    private Project project;

    public Customer() {

    }

    public Customer(String fName, String lName, String phone, Address address) {
        super(fName, lName, phone, address);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
