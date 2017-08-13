package com.sridhar.joinedtable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lila_avatar_joined")
public class LilaAvatar extends Avatar {

    private String lilaAvatarName;

    public LilaAvatar(String lilaAvatarName) {
        this.lilaAvatarName = lilaAvatarName;
    }

    public String getLilaAvatarName() {
        return lilaAvatarName;
    }

    public void setLilaAvatarName(String lilaAvatarName) {
        this.lilaAvatarName = lilaAvatarName;
    }
}
