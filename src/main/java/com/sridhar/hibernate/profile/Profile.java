package com.sridhar.hibernate.profile;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
    @Id
    private Long id;

    private String name;

    @Type(type="true_false")
    private boolean isActive;

    @Type(type="yes_no")
    private boolean isHidden;

    public Profile() {
    }

    public Profile(Long id, String name, boolean isActive, boolean isHidden) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.isHidden = isHidden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }
}
