package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import lombok.*;
@Data
@NoArgsConstructor
@Entity
@Table(name="ADDRESSES")

public class Address implements Serializable{ //
    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private String town;
    private String district;
    private String State;

}
