package com.example.handler.repository;

import com.example.handler.entity.MortgageApplicationResult;
import com.example.handler.model.MortgageApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MortgageApplicationResultRepository extends JpaRepository<MortgageApplicationResult, Long> {


    List<MortgageApplicationResult> findAllByIsSuccess(MortgageApplicationStatus status);

}
