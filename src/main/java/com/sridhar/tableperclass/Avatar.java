package com.sridhar.tableperclass;

import javax.persistence.*;

@Entity
@Table(name = "avatar_tblperclass")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long avatarId;

    public Long getAvatarId() {
        return avatarId;
    }


}
