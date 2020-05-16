package com.galbern.budget.domain;

import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
@Table(name="ITEMS")
@Audited
//@Embeddable // preferred when its Value Object  - this is an Entity object
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  long id;
    private String name;
    private double quantity;
    private double price;
    private boolean isActive = true;

    private String note; // e.g desired supplier

    @OneToMany
    private List<ItemComment> itemComments;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "id", nullable = true)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name="stageId", nullable=false) //
    private Stage stage;

    public Item(String name, double quantity, double price, String note) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }


}
