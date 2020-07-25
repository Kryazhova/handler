package com.example.handler.service;

import com.example.handler.entity.MortgageApplication;
import com.example.handler.model.MortgageRequest;
import com.example.handler.repository.CreditHistoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CreditHistoryService {

    private CreditHistoryRepository creditHistoryRepository;

    public CreditHistoryService(CreditHistoryRepository creditHistoryRepository) {
        this.creditHistoryRepository = creditHistoryRepository;
    }

    public boolean checker(MortgageApplication mortgageApplication){
        String firstName = mortgageApplication.getFirstName();
        String surname = mortgageApplication.getSurname();

        boolean isDebtor = !creditHistoryRepository
                .findAllBySurnameAndFirstNameAndDebtorTrue(
                        surname,
                        firstName
                ).isEmpty();
        boolean isBadRating = !creditHistoryRepository
                .findAllBySurnameAndFirstNameAndRatingLessThan(
                        surname,
                        firstName,
                        75
                ).isEmpty();
        return (isDebtor || isBadRating);

    }
}
