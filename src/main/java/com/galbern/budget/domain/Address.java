package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

import lombok.*;
import org.hibernate.envers.Audited;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="Address")
@Audited
public class Address {
    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; // wateva
    private String street;
    private String town;
    private String district;
    private String State;

}
