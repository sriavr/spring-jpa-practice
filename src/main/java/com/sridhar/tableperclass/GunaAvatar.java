package com.sridhar.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="guna_avatar_tblperclass")
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
