package com.sridhar.singletable;

import com.sridhar.common.Yoni;
import com.sridhar.common.Yuga;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("guna-avatar")
public class GunaAvatar extends Avatar {

    public GunaAvatar(){}

    public GunaAvatar(String gunaAvatarName, Yuga yuga, Yoni yoni) {
        this.gunaAvatarName = gunaAvatarName;
        this.yuga = yuga;
        this.yoni = yoni;
    }

    private String gunaAvatarName;

    public String getGunaAvatarName() {
        return gunaAvatarName;
    }

    public void setGunaAvatarName(String gunaAvatarName) {
        this.gunaAvatarName = gunaAvatarName;
    }
}
