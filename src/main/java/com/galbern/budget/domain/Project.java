package com.galbern.budget.domain;

import javax.persistence.*;
import java.util.Set;
import lombok.*;
import org.hibernate.envers.Audited;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@Entity
@Table(name="PROJECTS")
@Audited
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id", nullable = true)
    private Customer customer;

    @OneToMany(mappedBy="project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Stage> stages;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="address",  nullable = true)
    private Address address;
    private Boolean isActive;


}
