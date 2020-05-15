package com.galbern.budget.domain;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@MappedSuperclass // allows children to take the attributes
@Data

public abstract class Person {
    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    protected String fName;
    protected String lName;
    protected String phone;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="address", nullable=true)
    private Address address;

    public Person() {
    }


}
