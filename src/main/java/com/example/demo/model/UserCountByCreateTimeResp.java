package com.example.demo.model;


public class UserCountByCreateTimeResp {

    private Integer count;

    private Integer month;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "UserCountByCreateTimeResp{" +
                "count=" + count +
                ", month=" + month +
                '}';
    }
}