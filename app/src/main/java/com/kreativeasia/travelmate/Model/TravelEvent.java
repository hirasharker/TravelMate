package com.kreativeasia.travelmate.Model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hira on 11/19/2016.
 */

public class TravelEvent {
    private int travelEventId;
    private int userId;
    private float estimatedBudget;
    private Date fromDate;
    private Date tillDate;
    private String sourceLocation;
    private String destination;
    private Timestamp creationTime;

    public TravelEvent(int travelEventId, int userId, float estimatedBudget, Date fromDate, Date tillDate, String sourceLocation, String destination) {
        this.travelEventId = travelEventId;
        this.userId = userId;
        this.estimatedBudget = estimatedBudget;
        this.fromDate = fromDate;
        this.tillDate = tillDate;
        this.sourceLocation = sourceLocation;
        this.destination = destination;
        this.creationTime = this.setCreationTime();
    }

    public TravelEvent(int userId, float estimatedBudget, Date fromDate, Date tillDate, String sourceLocation, String destination) {
        this.userId = userId;
        this.estimatedBudget = estimatedBudget;
        this.fromDate = fromDate;
        this.tillDate = tillDate;
        this.sourceLocation = sourceLocation;
        this.destination = destination;
        this.creationTime = this.setCreationTime();
    }

    public TravelEvent() {
        this.creationTime = this.setCreationTime();
    }

    public int getTravelEventId() {
        return travelEventId;
    }

    public int getUserId() {
        return userId;
    }

    public float getEstimatedBudget() {
        return estimatedBudget;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getTillDate() {
        return tillDate;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public String getDestination() {
        return destination;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    private Timestamp setCreationTime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return this.creationTime = Timestamp.valueOf(simpleDateFormat.format(date));
    }
}
