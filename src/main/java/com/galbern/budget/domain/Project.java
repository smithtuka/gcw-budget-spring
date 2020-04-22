package com.galbern.budget.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy="project")
    private Set<Stage> stages;

  //  @Embedded // - embedded created issues when used other than relationships
//    @AttributeOverrides({
//            @AttributeOverride( name = "id", column = @Column(name = "address_Id")),
//            @AttributeOverride( name = "street", column = @Column(name = "add_street")),
//            @AttributeOverride( name = "town", column = @Column(name = "add_town"),
//            @AttributeOverride( name = "district", column = @Column(name = "add_city"),
//            @AttributeOverride( name = "state", column = @Column(name = "add_city"))
//})
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="address")
    private Address address;
    private Boolean isActive;

    public Project() {
    }

    public Project(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
        isActive = true;
    }
    public Project(String name) {
        this.name = name;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public Set<Stage> getStages() {
        return stages;
    }

    public void setStages(Set<Stage> stages) {
        this.stages = stages;
    }

    public long getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;

        Project project = (Project) o;

        if (projectId != project.projectId) return false;
        if (!name.equals(project.name)) return false;
        return customer.equals(project.customer);

    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + customer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + projectId +
                ", name='" + name + '\'' +
                ", customer=" + customer +
                ", address=" + address +
                '}';
    }
}
