package com.galbern.budget.domain;

import javax.persistence.*;
import java.util.Set;
import lombok.*;
@Data
@NoArgsConstructor
@Entity
@Table(name="PROJECTS")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id", nullable = true)
    private Customer customer;

    @OneToMany(mappedBy="project")
    private Set<Stage> stages;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="address",  nullable = true)
    private Address address;
    private Boolean isActive;


}
