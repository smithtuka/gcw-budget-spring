package com.galbern.budget.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@Entity
@Table(name="STAGES")
@Audited
//@Embeddable // again not a Value object
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stageId;
    private String name;
    private short stageNum;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn( name="project_id", nullable = false) // here stage owns the rlnshp
    private Project project;
    @OneToMany(mappedBy="stage", fetch=FetchType.LAZY, cascade = CascadeType.ALL) // Items is owner of the rlshnp
//    @JoinColumn( nullable = true)
    private Set<Item> items;
    Boolean isActive;


}
