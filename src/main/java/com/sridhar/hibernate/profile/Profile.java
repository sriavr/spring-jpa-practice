package com.sridhar.hibernate.profile;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Profile {
    @Id
    private Long id;

    private String name;

    //automatic conversion to 'T' or 'F' in db
    @Type(type="true_false")
    private boolean isActive;

    //automatic conversion to 'Y' or 'N' in db
    @Type(type="yes_no")
    private boolean isHidden;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> tagList;

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

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
