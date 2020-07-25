package com.example.handler.controller;

import com.example.handler.entity.MortgageApplication;
import com.example.handler.entity.MortgageApplicationResult;
import com.example.handler.model.MortgageApplicationStatus;
import com.example.handler.model.MortgageRequest;
import com.example.handler.model.MortgageResponse;
import com.example.handler.repository.MortgageApplicationRepository;
import com.example.handler.repository.MortgageApplicationResultRepository;
import com.example.handler.service.MortgageScoringResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MortgageController {
    private final MortgageApplicationRepository repository;
    private final MortgageApplicationResultRepository resultRepository;
    private MortgageScoringResult result;

    public MortgageController(MortgageApplicationRepository repository, MortgageApplicationResultRepository resultRepository, MortgageScoringResult result) {
        this.repository = repository;
        this.resultRepository = resultRepository;
        this.result = result;
    }

    @PostMapping("/mortgages")
    public MortgageResponse register(@RequestBody MortgageRequest request) {
        MortgageApplication mortgageApplication = new MortgageApplication();
        mortgageApplication.setSurname(request.getSurname());
        mortgageApplication.setFirstName(request.getFirstName());
        mortgageApplication.setCreditAmount(request.getCreditAmount());
        mortgageApplication.setCreditPeriod(request.getCreditPeriod());
        mortgageApplication.setSalary(request.getSalary());
        mortgageApplication = repository.save(mortgageApplication);

        MortgageResponse response = new MortgageResponse();
        response.setRequest(request);
        response.setId(mortgageApplication.getId());
        response.setResolution(result.checkStatus(mortgageApplication));
        return response;
    }
    @GetMapping("/mortgages/successful")
    public List<MortgageApplicationResult> getAllSuccess() {
        return resultRepository.findAllByIsSuccess(MortgageApplicationStatus.SUCCESS);
    }

    @GetMapping("/mortgages/declined")
    public List<MortgageApplicationResult> getAllDecline() {
        return resultRepository.findAllByIsSuccess(MortgageApplicationStatus.DECLINE);
    }
}
