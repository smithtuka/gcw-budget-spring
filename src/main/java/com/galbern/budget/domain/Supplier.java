package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.*;
@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@Entity
@Table(name="SUPPLIERS")
public class Supplier extends Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL) // edit to have clean table
    @JoinColumn(name="id", nullable = true)
    private Set<Item> items;




}
