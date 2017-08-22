package com.sridhar.temple.entity;

import javax.persistence.*;

@Entity
@Table(name="temple_donors_list")
public class TempleDonorMapping {

    @Id
    @Column(name = "tdlst_id")
    @GeneratedValue
    private Long templeDonorMappingId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ttdlst_temple_id")
    private Temple temple;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tdlst_person_id")
    private Person donor;

    public Long getTempleDonorMappingId() {
        return templeDonorMappingId;
    }

    public void setTempleDonorMappingId(Long templeDonorMappingId) {
        this.templeDonorMappingId = templeDonorMappingId;
    }

    public Temple getTemple() {
        return temple;
    }

    public void setTemple(Temple temple) {
        this.temple = temple;
    }

    public Person getDonor() {
        return donor;
    }

    public void setDonor(Person donor) {
        this.donor = donor;
    }
}
