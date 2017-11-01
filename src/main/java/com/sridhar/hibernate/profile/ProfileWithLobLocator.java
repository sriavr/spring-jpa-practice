package com.sridhar.hibernate.profile;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.io.IOUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

@Entity
public class ProfileWithLobLocator {
    @Id
    private Long id;

    private String name;

    public ProfileWithLobLocator() {
    }

    public ProfileWithLobLocator(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonIgnore
    @Lob
    private Clob commentsClob;

    @Transient
    private String comments;

    public Clob getCommentsClob() {
        return commentsClob;
    }

    public void setCommentsClob(Clob commentsClob) {
        this.commentsClob = commentsClob;
    }

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

    public String getComments() throws SQLException, IOException {
        if(this.getCommentsClob()!=null){
            Reader reader = this.getCommentsClob().getCharacterStream();
            BufferedReader bufferedReader = new BufferedReader(reader);
            this.comments = IOUtils.toString(bufferedReader);
        }
        return comments;
    }
}
