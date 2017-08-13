package com.sridhar.singletable;

import javax.persistence.*;

@Entity
@Table(name = "avatar_single")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name="avatartype",
        discriminatorType=DiscriminatorType.STRING
)
public abstract class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long avatarId;

    public Long getAvatarId() {
        return avatarId;
    }


}
