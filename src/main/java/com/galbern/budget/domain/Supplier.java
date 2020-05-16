package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import lombok.*;
import org.hibernate.envers.Audited;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@Entity
@Table(name="SUPPLIERS")
@Audited
public class Supplier extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL) // edit to have clean table
    @JoinColumn(name="item_id", nullable = true)
    private List<Item> items;




}
