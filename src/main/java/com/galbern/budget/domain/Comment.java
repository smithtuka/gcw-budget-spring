package com.galbern.budget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
//@Audited
public abstract class Comment { // notifications in front-end
    @Id
    @GeneratedValue
    protected long id;
    protected String narration; // need to add writer? (@Audited)




}
