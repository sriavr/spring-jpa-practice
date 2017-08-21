package com.sridhar.temple.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Deity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String deityId;

    private String deityName;

    public String getDeityId() {
        return deityId;
    }

    public String getDeityName() {
        return deityName;
    }

    public void setDeityName(String deityName) {
        this.deityName = deityName;
    }
}
