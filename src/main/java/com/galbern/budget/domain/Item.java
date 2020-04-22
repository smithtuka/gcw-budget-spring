package com.galbern.budget.domain;

import javax.persistence.*;

@Entity
@Table(name="Items")
//@Embeddable // preferred when its Value Object  - this is an Entity object
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  long id;
    private String name;
    private double quantity;
    private double price;
    private String comment; // desired supplier
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="supplier_id", nullable = true)
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

    public Item() {
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                '}';
    }
}
