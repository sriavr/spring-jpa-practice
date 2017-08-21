package com.sridhar.temple.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activity", indexes = {}, uniqueConstraints = {})
public class Activity {

    @Id
    @GeneratedValue
    private Long activityId;

    @Temporal(TemporalType.DATE)
    private Date activityDate;

    private String activityTitle;

    private String activityDetails;

    public Long getActivityId() {
        return activityId;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityDetails() {
        return activityDetails;
    }

    public void setActivityDetails(String activityDetails) {
        this.activityDetails = activityDetails;
    }
}
