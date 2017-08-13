package com.sridhar.singletable;

import com.sridhar.common.Yoni;
import com.sridhar.common.Yuga;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("purusha-avatar")
@Entity
public class PurushaAvatar extends Avatar {

    public PurushaAvatar() { }

    public PurushaAvatar(String purushaAvatarName, Yuga yuga, Yoni yoni) {
        this.purushaAvatarName = purushaAvatarName;
        this.yuga = yuga;
        this.yoni = yoni;
    }

    private String purushaAvatarName;

    public String getPurushaAvatarName() {
        return purushaAvatarName;
    }

    public void setPurushaAvatarName(String purushaAvatarName) {
        this.purushaAvatarName = purushaAvatarName;
    }

}
