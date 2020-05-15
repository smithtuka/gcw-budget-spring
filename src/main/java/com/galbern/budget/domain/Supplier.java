package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="SUPPLIERS")
public class Supplier extends Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL) // edit to have clean table
    @JoinColumn(name="Item_id", nullable = true)
    private Set<Item> items;

    public Supplier() {
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }


}
