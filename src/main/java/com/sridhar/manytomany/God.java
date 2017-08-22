package com.sridhar.manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class God {

    @Id
    @GeneratedValue
    private Long godId;

    private String godName;

    @ManyToMany(mappedBy = "godList")
    private List<Devotee> devoteeList;

    public Long getGodId() {
        return godId;
    }

    public void setGodId(Long godId) {
        this.godId = godId;
    }

    public String getGodName() {
        return godName;
    }

    public void setGodName(String godName) {
        this.godName = godName;
    }

    public List<Devotee> getDevoteeList() {
        return devoteeList;
    }

    public void setDevoteeList(List<Devotee> devoteeList) {
        this.devoteeList = devoteeList;
    }
}
