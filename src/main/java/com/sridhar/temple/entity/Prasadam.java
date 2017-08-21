package com.sridhar.temple.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prasadam {

    @Id
    @GeneratedValue
    private Long prasadamId;

    private String prasadamName;

    private PrasadamType prasadamType;

    public Long getPrasadamId() {
        return prasadamId;
    }

    public String getPrasadamName() {
        return prasadamName;
    }

    public void setPrasadamName(String prasadamName) {
        this.prasadamName = prasadamName;
    }

    public PrasadamType getPrasadamType() {
        return prasadamType;
    }

    public void setPrasadamType(PrasadamType prasadamType) {
        this.prasadamType = prasadamType;
    }
}
