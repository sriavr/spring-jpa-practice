package com.sridhar.manytomany;

import javax.persistence.*;

@Entity
@Table(name="god_devotee_mapping")
public class GodDevoteeMapping {

    @Id
    @GeneratedValue
    private Long gdmId;

    @ManyToOne
    @JoinColumn(name = "gdm_god_id")
    private God god;

    @ManyToOne
    @JoinColumn(name="gdm_devotee_id")
    private Devotee devotee;

    public Long getGdmId() {
        return gdmId;
    }

    public void setGdmId(Long gdmId) {
        this.gdmId = gdmId;
    }

    public God getGod() {
        return god;
    }

    public void setGod(God god) {
        this.god = god;
    }

    public Devotee getDevotee() {
        return devotee;
    }

    public void setDevotee(Devotee devotee) {
        this.devotee = devotee;
    }
}
