package com.sridhar.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Devotee {

    @Id
    @GeneratedValue
    private Long devoteeId;

    private String devoteeName;

    @ManyToMany
    @JoinTable(
            name = "god_devotee_mapping",
            joinColumns = @JoinColumn(name = "gdm_devotee_id", referencedColumnName = "devoteeId"),
            inverseJoinColumns = @JoinColumn(name="gdm_god_id", referencedColumnName = "godId")
    )
    private List<God> godList;

    public Long getDevoteeId() {
        return devoteeId;
    }

    public void setDevoteeId(Long devoteeId) {
        this.devoteeId = devoteeId;
    }

    public String getDevoteeName() {
        return devoteeName;
    }

    public void setDevoteeName(String devoteeName) {
        this.devoteeName = devoteeName;
    }

    public List<God> getGodList() {
        return godList;
    }

    public void setGodList(List<God> godList) {
        this.godList = godList;
    }
}
