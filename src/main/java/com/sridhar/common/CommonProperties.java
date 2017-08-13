package com.sridhar.common;

import org.hibernate.usertype.UserType;

import javax.persistence.*;

@MappedSuperclass
public class CommonProperties {

    @Basic
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    protected Yuga yuga;


    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    protected Yoni yoni;
}
