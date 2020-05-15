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


}
