package com.sridhar.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("lila-avatar")
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
