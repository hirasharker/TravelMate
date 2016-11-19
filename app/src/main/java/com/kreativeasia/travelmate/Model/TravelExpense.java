package com.kreativeasia.travelmate.Model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hira on 11/19/2016.
 */

public class TravelExpense {
    private int travelExpenseId;
    private int userId;
    private int travelEventId;
    private String expenseDetail;
    private float expenseAmount;
    private Timestamp creationTime;

    public TravelExpense(int travelExpenseId, int userId, int travelEventId, String expenseDetail, float expenseAmount) {
        this.travelExpenseId = travelExpenseId;
        this.userId = userId;
        this.travelEventId = travelEventId;
        this.expenseDetail = expenseDetail;
        this.expenseAmount = expenseAmount;
        this.creationTime = this.setTimestamp();
    }

    public TravelExpense(int userId, int travelEventId, String expenseDetail, float expenseAmount) {
        this.userId = userId;
        this.travelEventId = travelEventId;
        this.expenseDetail = expenseDetail;
        this.expenseAmount = expenseAmount;
        this.creationTime = this.setTimestamp();
    }

    public TravelExpense() {
        this.creationTime = this.setTimestamp();
    }

    public int getTravelExpenseId() {
        return travelExpenseId;
    }

    public int getUserId() {
        return userId;
    }

    public int getTravelEventId() {
        return travelEventId;
    }

    public String getExpenseDetail() {
        return expenseDetail;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public Timestamp getTimestamp() {
        return creationTime;
    }

    private Timestamp setTimestamp() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return this.creationTime = Timestamp.valueOf(simpleDateFormat.format(date));
    }
}
