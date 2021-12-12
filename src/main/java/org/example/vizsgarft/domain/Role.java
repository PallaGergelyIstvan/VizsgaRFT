
package org.example.vizsgarft.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "roles")
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    private String role;
    @ManyToMany (mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public Role() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<User> getUseres() {
        return users;
    }

    public void setUseres(Set<User> useres) {
        this.users = useres;
    }

    @Override
    public String toString() {
        return "Role id= " + id + " role= " + role;
    }
}

