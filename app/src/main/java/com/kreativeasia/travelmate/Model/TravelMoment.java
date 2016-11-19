package com.kreativeasia.travelmate.Model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hira on 11/19/2016.
 */

public class TravelMoment {
    private int travelMomentId;
    private int userId;
    private int travelEventId;
    private String momentDetail;
    private String momentImagePath;
    private Timestamp creationTime;

    public TravelMoment(int travelMomentId, int userId, int travelEventId, String momentDetail, String momentImagePath) {
        this.travelMomentId = travelMomentId;
        this.userId = userId;
        this.travelEventId = travelEventId;
        this.momentDetail = momentDetail;
        this.momentImagePath = momentImagePath;
        this.creationTime = this.setCreationTime();
    }

    public TravelMoment(int userId, int travelEventId, String momentDetail, String momentImagePath) {
        this.userId = userId;
        this.travelEventId = travelEventId;
        this.momentDetail = momentDetail;
        this.momentImagePath = momentImagePath;
        this.creationTime = this.setCreationTime();
    }

    public TravelMoment() {
        this.creationTime = this.setCreationTime();
    }

    public int getTravelMomentId() {
        return travelMomentId;
    }

    public int getUserId() {
        return userId;
    }

    public int getTravelEventId() {
        return travelEventId;
    }

    public String getMomentDetail() {
        return momentDetail;
    }

    public String getMomentImagePath() {
        return momentImagePath;
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
