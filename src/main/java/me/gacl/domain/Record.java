package me.gacl.domain;

import java.util.Date;

public class Record {
    private Integer id;

    private Integer recdId;

    private Integer empId;

    private Date date;

    private Date time;

    private Date realTime;

    private Integer recdType;

    private Byte morNoon;

    private Byte workState;

    private Byte from;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecdId() {
        return recdId;
    }

    public void setRecdId(Integer recdId) {
        this.recdId = recdId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getRealTime() {
        return realTime;
    }

    public void setRealTime(Date realTime) {
        this.realTime = realTime;
    }

    public Integer getRecdType() {
        return recdType;
    }

    public void setRecdType(Integer recdType) {
        this.recdType = recdType;
    }

    public Byte getMorNoon() {
        return morNoon;
    }

    public void setMorNoon(Byte morNoon) {
        this.morNoon = morNoon;
    }

    public Byte getWorkState() {
        return workState;
    }

    public void setWorkState(Byte workState) {
        this.workState = workState;
    }

    public Byte getFrom() {
        return from;
    }

    public void setFrom(Byte from) {
        this.from = from;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}