package com.galbern.budget.domain;

import javax.persistence.*;

import lombok.*;
import org.hibernate.envers.Audited;

import java.util.Set;
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@Entity
@Audited
public class Requistion extends Auditable<String>{

    @Id
    @GeneratedValue
    private String id;

    @OneToOne
    private User user;

    @OneToOne
    private Stage stage;

    @OneToOne
    private Project project;

    @OneToMany
    private Set<Item> items;

    @Enumerated(EnumType.STRING)
    private ApprovalStatus approvalStatus;

    @OneToOne
    private RequisitionComment comment;

}
