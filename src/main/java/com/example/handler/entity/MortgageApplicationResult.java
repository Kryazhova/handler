package com.example.handler.entity;

import com.example.handler.model.MortgageApplicationStatus;

import javax.persistence.*;

@Entity
public class MortgageApplicationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private MortgageApplicationStatus isSuccess;
    private boolean isLowSalary;
    private boolean isDebtor;
    private boolean isTerrorist;
    private long customerId;


    @OneToOne
    MortgageApplication mortgageApplication;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MortgageApplicationStatus getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(MortgageApplicationStatus isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isLowSalary() {
        return isLowSalary;
    }

    public void setLowSalary(boolean lowSalary) {
        isLowSalary = lowSalary;
    }

    public boolean isDebtor() {
        return isDebtor;
    }

    public void setDebtor(boolean debtor) {
        isDebtor = debtor;
    }

    public boolean isTerrorist() {
        return isTerrorist;
    }

    public void setTerrorist(boolean terrorist) {
        isTerrorist = terrorist;
    }

    public MortgageApplication getMortgageApplication() {
        return mortgageApplication;
    }

    public void setMortgageApplication(MortgageApplication mortgageApplication) {
        this.mortgageApplication = mortgageApplication;
    }

    @Override
    public String toString() {
        return "MortgageApplicationResult{" +
                "id=" + id +
                ", isSuccess=" + isSuccess +
                ", isLowSalary=" + isLowSalary +
                ", isDebtor=" + isDebtor +
                ", isTerrorist=" + isTerrorist +
                '}';
    }
}
