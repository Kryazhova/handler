package com.example.handler.entity;


import com.example.handler.model.MortgageRequest;

import javax.persistence.*;

@Entity
public class MortgageApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String surname;
    private String firstName;
    private long salary;
    private int creditPeriod;
    private long creditAmount;

    public MortgageApplication(MortgageRequest request) {
        this.setSurname(request.getSurname());
        this.setFirstName(request.getFirstName());
        this.setCreditAmount(request.getCreditAmount());
        this.setCreditPeriod(request.getCreditPeriod());
        this.setSalary(request.getSalary());
    }

    public MortgageApplication(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        return "MortgageApplication{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ", creditPeriod=" + creditPeriod +
                ", creditAmount=" + creditAmount +
                '}';
    }
}
