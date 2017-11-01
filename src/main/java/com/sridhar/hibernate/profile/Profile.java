package com.sridhar.hibernate.profile;

import com.sridhar.temple.entity.Person;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    /*
    @ElementCollection is mainly for mapping non-entities (embeddable or basic)
    while @OneToMany is used to map entities.

    It also means that the elements are completely owned by the containing entities:
    they're modified when the entity is modified, deleted when the entity is deleted, etc.
    They can't have their own lifecycle.
     */

    //value type
    @LazyCollection(LazyCollectionOption.FALSE)
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="profile_tags", joinColumns=@JoinColumn(name="id"))
    @Column(name="tag_name")
    private List<String> tagList;

    //Embeddable type
    @ElementCollection(fetch = FetchType.LAZY)
    private List<Address> addressList;

    //Entity type
    @ElementCollection(fetch = FetchType.LAZY)
    private Set<Person> personList;

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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Set<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(Set<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
