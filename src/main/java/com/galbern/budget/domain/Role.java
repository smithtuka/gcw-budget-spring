package com.galbern.budget.domain;

import javax.persistence.Embeddable;


public enum Role {
    ACCOUNTANT,
    ENGINEER,
    CONSULTANT,
    SUPERVISOR,
    DIRECTOR,
    SUPERADMIN;

    @Override
    public String toString() {
        return super.toString();
    }
}
