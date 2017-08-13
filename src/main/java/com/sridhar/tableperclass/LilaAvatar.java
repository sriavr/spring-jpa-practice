package com.sridhar.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lila_avatar_tblperclass")
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
