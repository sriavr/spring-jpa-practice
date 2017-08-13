package com.sridhar.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("guna-avatar")
public class GunaAvatar extends Avatar {

    public GunaAvatar(String gunaAvatarName) {
        this.gunaAvatarName = gunaAvatarName;
    }

    private String gunaAvatarName;

    public String getGunaAvatarName() {
        return gunaAvatarName;
    }

    public void setGunaAvatarName(String gunaAvatarName) {
        this.gunaAvatarName = gunaAvatarName;
    }
}
