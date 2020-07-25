package com.example.handler.model;

import java.io.Serializable;

public class MortgageRequest implements Serializable {

    private String firstName;
    private String surname;
    private long salary;
    private int creditPeriod;
    private long creditAmount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getCreditPeriod() {
        return creditPeriod;
    }

    public void setCreditPeriod(int creditPeriod) {
        this.creditPeriod = creditPeriod;
    }

    public long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(long creditAmount) {
        this.creditAmount = creditAmount;
    }

    @Override
    public String toString() {
        return "MortgageRequest{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", creditPeriod=" + creditPeriod +
                ", creditAmount=" + creditAmount +
                '}';
    }
}
