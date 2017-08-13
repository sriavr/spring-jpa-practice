package com.sridhar.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("purusha-avatar")
@Entity
public class PurushaAvatar extends Avatar {

    public PurushaAvatar(String purushaAvatarName) {
        this.purushaAvatarName = purushaAvatarName;
    }

    private String purushaAvatarName;

    public String getPurushaAvatarName() {
        return purushaAvatarName;
    }

    public void setPurushaAvatarName(String purushaAvatarName) {
        this.purushaAvatarName = purushaAvatarName;
    }

}
