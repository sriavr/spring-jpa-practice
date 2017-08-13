package com.sridhar.joinedtable;

import javax.persistence.*;

@Entity
@Table(name = "avatar_joined")
@Inheritance(strategy = InheritanceType.JOINED)
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long avatarId;

    public Long getAvatarId() {
        return avatarId;
    }


}
