package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ADDRESSES")
//@MappedSuperclass
public class Address implements Serializable{ //
    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private String town;
    private String district;
    private String State;


    public Address() {
    }

    public Address(String street, String town, String district, String state) {
        this.street = street;
        this.town = town;
        this.district = district;
        State = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address )) return false;

        Address address = (Address) o;

        if (id != address.id) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (town != null ? !town.equals(address.town) : address.town != null) return false;
        if (district != null ? !district.equals(address.district) : address.district != null) return false;
        return State != null ? State.equals(address.State) : address.State == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (town != null ? town.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (State != null ? State.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", district='" + district + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
