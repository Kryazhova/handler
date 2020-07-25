package com.example.handler.model;

import java.io.Serializable;

public class MortgageResponse implements Serializable {

    private MortgageRequest request;
    private long id;
    private MortgageApplicationStatus resolution;

    public MortgageRequest getRequest() {
        return request;
    }

    public void setRequest(MortgageRequest request) {
        this.request = request;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MortgageApplicationStatus getResolution() {
        return resolution;
    }

    public void setResolution(MortgageApplicationStatus resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "MortgageResponse{" +
                "request=" + request +
                ", id=" + id +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
