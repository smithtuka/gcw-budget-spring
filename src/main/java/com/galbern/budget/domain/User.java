package com.galbern.budget.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="USERS")
    //@EmbeddedId / @IdClass(UserId.class) - composite key
    //@AttributeOverride(name = "fName", column = @Column(name = "fName", insertable = false, updatable = false)
    // ignoring sm of parent attributes above
public class User extends Person implements Serializable { // class of composite Ids must implement serializable public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // = super.getId();

    private String username;
    private String password;
    private Boolean isActive;
    @Enumerated(EnumType.STRING) // otherwise wd automatically be mapped to value 0--- (ORDINAL)
    private Role role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        isActive = true;
    }
    public User() {
    }

    public User(String fName, String lName, String phone, Address address, String username, String password) {
        super(fName, lName, phone, address);
        this.username = username;
        this.password = password;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }

}
