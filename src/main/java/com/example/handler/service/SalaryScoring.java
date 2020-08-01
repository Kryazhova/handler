package com.example.handler.service;

import com.example.handler.entity.MortgageApplication;
import org.springframework.stereotype.Service;

@Service
public class SalaryScoring {

    public boolean salaryScoring(MortgageApplication mortgageApplication){
        long monthlyPayment = mortgageApplication.getCreditAmount() / mortgageApplication.getCreditPeriod();
        return (monthlyPayment >= mortgageApplication.getSalary() / 2);
    }

}
