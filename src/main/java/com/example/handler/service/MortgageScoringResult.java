package com.example.handler.service;

import com.example.handler.entity.MortgageApplication;
import com.example.handler.entity.MortgageApplicationResult;
import com.example.handler.model.MortgageApplicationStatus;
import com.example.handler.repository.MortgageApplicationResultRepository;
import org.springframework.stereotype.Service;
import static com.example.handler.model.MortgageApplicationStatus.*;

@Service
public class MortgageScoringResult {

    private final MortgageApplicationResultRepository mortgageApplicationResultRepository;
    private final SalaryScoring salaryScoring;
    private final CreditHistoryService creditHistoryService;
    private final TerroristRegistry terroristRegistry;


    public MortgageScoringResult(MortgageApplicationResultRepository mortgageApplicationResultRepository,
                                 SalaryScoring salaryScoring,
                                 CreditHistoryService creditHistoryService,
                                 TerroristRegistry terroristRegistry) {
        this.mortgageApplicationResultRepository = mortgageApplicationResultRepository;
        this.salaryScoring = salaryScoring;
        this.creditHistoryService = creditHistoryService;
        this.terroristRegistry = terroristRegistry;
    }

    public MortgageApplicationStatus checkStatus(MortgageApplication mortgageApplication) {
        boolean isLowSalary = salaryScoring.salaryScoring(mortgageApplication);
        boolean isDebtor = creditHistoryService.checker(mortgageApplication);
        boolean isTerrorist = terroristRegistry.checkIsTerrorist();

        MortgageApplicationResult mortgageApplicationResult = new MortgageApplicationResult();
        mortgageApplicationResult.setLowSalary(isLowSalary);
        mortgageApplicationResult.setTerrorist(isTerrorist);
        mortgageApplicationResult.setDebtor(isDebtor);
        mortgageApplicationResult.setCustomerId(mortgageApplication.getId());


        if (isLowSalary || isDebtor || isTerrorist) {
            mortgageApplicationResult.setIsSuccess(DECLINE);
        } else mortgageApplicationResult.setIsSuccess(SUCCESS);
        mortgageApplicationResult = mortgageApplicationResultRepository.save(mortgageApplicationResult);

        return mortgageApplicationResult.getIsSuccess();
    }
}
