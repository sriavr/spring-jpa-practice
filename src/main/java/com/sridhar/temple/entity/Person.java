package com.sridhar.temple.entity;


import javax.persistence.*;

@Entity
@Table(name="person", uniqueConstraints = {@UniqueConstraint(columnNames = {"emailAddress"})})
public class Person {
    @Id
    @GeneratedValue
    private Long personId;

    private String fullName;

    private String emailAddress;

    @Embedded
    private Address permanentAddress;

    public Long getPersonId() {
        return personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
