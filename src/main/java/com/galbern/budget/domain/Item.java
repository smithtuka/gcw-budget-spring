package com.galbern.budget.domain;

import javax.persistence.*;
    import lombok.*;
    @Data
    @NoArgsConstructor
@Entity
@Table(name="ITEMS")
//@Embeddable // preferred when its Value Object  - this is an Entity object
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  long id;
    private String name;
    private double quantity;
    private double price;
    private boolean isActive = true;

    private String comment=""; // desired supplier
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "id", nullable = true)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name="stageId", nullable=false) //
    private Stage stage;

    public Item(String name, double quantity, double price, String comment) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.comment = comment;
    }


}
