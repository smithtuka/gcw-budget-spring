package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Suppliers")
public class Supplier extends Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL) // edit to have clean table
    @JoinColumn(name="Item_id", nullable = true)
    private Set<Item> items;

    public Supplier() {
    }

    public Supplier(String fName, String lName, String phone, Address address) {
        super(fName, lName, phone, address);
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
    @Override
    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;
        if (!super.equals(o)) return false;

        Supplier supplier = (Supplier) o;

        return id == supplier.id;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                "} " + super.toString();
    }
}
