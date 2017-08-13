package com.sridhar.singletable;

import com.sridhar.common.Yoni;
import com.sridhar.common.Yuga;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("lila-avatar")
public class LilaAvatar extends Avatar {

    public LilaAvatar(String lilaAvatarName) { }

    public LilaAvatar(String lilaAvatarName, Yuga yuga, Yoni yoni) {
        this.lilaAvatarName = lilaAvatarName;
        this.yuga = yuga;
        this.yoni = yoni;
    }

    private String lilaAvatarName;

    public String getLilaAvatarName() {
        return lilaAvatarName;
    }

    public void setLilaAvatarName(String lilaAvatarName) {
        this.lilaAvatarName = lilaAvatarName;
    }
}
