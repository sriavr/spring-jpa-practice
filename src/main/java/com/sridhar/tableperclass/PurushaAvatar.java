package com.sridhar.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "purusha_avatar_tblperclass")
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
