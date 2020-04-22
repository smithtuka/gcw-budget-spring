package com.galbern.budget.domain;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass // allows children to take the attributes
public abstract class Person {
    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fName;
    private String lName;
    private String phone;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="id", column=@Column(name="address_id")),
//            @AttributeOverride(name="street", column=@Column(name="street")),
//            @AttributeOverride(name="town", column=@Column(name="town")),
//            @AttributeOverride(name="district", column=@Column(name="district")),
//            @AttributeOverride(name="State", column=@Column(name="state"))
//    })
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="address", nullable=true)
    private Address address;

    public Person() {
    }

    public Person(String fName, String lName, String phone, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.address = address;
    }


    public Person(String fName, String lName, String phone) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (fName != null ? !fName.equals(person.fName) : person.fName != null) return false;
        if (lName != null ? !lName.equals(person.lName) : person.lName != null) return false;
        if (phone != null ? !phone.equals(person.phone) : person.phone != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }

    @Override
    public int hashCode() {
        int result = fName != null ? fName.hashCode() : 0;
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
