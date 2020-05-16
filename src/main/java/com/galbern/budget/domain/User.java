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
@Table(name ="USERS")
@Audited
    //@EmbeddedId / @IdClass(UserId.class) - composite key
    //@AttributeOverride(name = "fName", column = @Column(name = "fName", insertable = false, updatable = false)
    // ignoring sm of parent attributes above
public class User extends Person implements Serializable { // class of composite Ids must implement serializable public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // = super.getId();

    private String username;
    private String password;
    private Boolean isActive = true;
    @Enumerated(EnumType.STRING) // otherwise wd automatically be mapped to value 0--- (ORDINAL)
    private Role role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



}
