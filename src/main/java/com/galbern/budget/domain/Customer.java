package com.galbern.budget.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="CUSTOMERS") //, schema = ""
public class Customer extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="projectId", nullable=true)
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", project=" + project +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        return project != null ? project.equals(customer.project) : customer.project == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }
}
