package com.sridhar.hibernate.profile;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity
public class ProfileWithMaterializedLob  {
    @Id
    private Long id;

    private String name;

    public ProfileWithMaterializedLob() {
    }

    public ProfileWithMaterializedLob(Long id, String name, String commentsLobStr) {
        this.id = id;
        this.name = name;
        this.commentsLobStr = commentsLobStr;
    }

    @JsonIgnore
    @Lob
    private String commentsLobStr;

    @Transient
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommentsLobStr() {
        return commentsLobStr;
    }

    public void setCommentsLobStr(String commentsLobStr) {
        this.commentsLobStr = commentsLobStr;
    }

    public String getComments() {
        return commentsLobStr;
    }
}
