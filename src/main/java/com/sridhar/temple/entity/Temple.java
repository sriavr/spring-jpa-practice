package com.sridhar.temple.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="temple")
public class Temple {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String templeId;

    @Temporal(TemporalType.DATE)
    private Date dateOfInaguration;

    @Column(nullable = false)
    private String templeName;

    @Embedded
    private Address templeAddress;

    @OneToOne(targetEntity = Person.class, cascade = {CascadeType.REMOVE, CascadeType.MERGE})
    @JoinColumn
    private Person president;

    @OneToOne
    private Person headPriest;

    @OneToMany
    private List<Person> priestList;

    @OneToMany
    private List<Activity> activityList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "temple_donors_list",
            joinColumns = @JoinColumn(name="temple_temple_id", referencedColumnName = "templeId"),
            inverseJoinColumns = @JoinColumn(name="donors_list_person_id", referencedColumnName = "personId")
    )
    private List<Person> donorsList;

    @ManyToOne
    private Deity mainDeity;

    @ManyToMany
    private List<Deity> otherDeities;

    @ManyToMany
    private List<Prasadam> prasadamList;

    public String getTempleId() {
        return templeId;
    }

    public Date getDateOfInaguration() {
        return dateOfInaguration;
    }

    public void setDateOfInaguration(Date dateOfInaguration) {
        this.dateOfInaguration = dateOfInaguration;
    }

    public String getTempleName() {
        return templeName;
    }

    public void setTempleName(String templeName) {
        this.templeName = templeName;
    }

    public Address getTempleAddress() {
        return templeAddress;
    }

    public void setTempleAddress(Address templeAddress) {
        this.templeAddress = templeAddress;
    }

    public Person getPresident() {
        return president;
    }

    public void setPresident(Person president) {
        this.president = president;
    }

    public Person getHeadPriest() {
        return headPriest;
    }

    public void setHeadPriest(Person headPriest) {
        this.headPriest = headPriest;
    }

    public List<Person> getPriestList() {
        return priestList;
    }

    public void setPriestList(List<Person> priestList) {
        this.priestList = priestList;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public List<Person> getDonorsList() {
        return donorsList;
    }

    public void setDonorsList(List<Person> donorsList) {
        this.donorsList = donorsList;
    }

    public Deity getMainDeity() {
        return mainDeity;
    }

    public void setMainDeity(Deity mainDeity) {
        this.mainDeity = mainDeity;
    }

    public List<Deity> getOtherDeities() {
        return otherDeities;
    }

    public void setOtherDeities(List<Deity> otherDeities) {
        this.otherDeities = otherDeities;
    }

    public List<Prasadam> getPrasadamList() {
        return prasadamList;
    }

    public void setPrasadamList(List<Prasadam> prasadamList) {
        this.prasadamList = prasadamList;
    }
}
