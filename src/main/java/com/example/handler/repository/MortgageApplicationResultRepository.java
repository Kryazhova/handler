package com.example.handler.repository;

import com.example.handler.entity.MortgageApplicationResult;
import com.example.handler.model.MortgageApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MortgageApplicationResultRepository extends JpaRepository<MortgageApplicationResult, Long> {

//    @Query(value = "SELECT * FROM mortgage_application_result JOIN mortgage_application on mortgage_application_result.customer_id = mortgage_application.id WHERE mortgage_application_result.is_success = true",
//            nativeQuery = true)
    List<MortgageApplicationResult> findAllByIsSuccess(MortgageApplicationStatus status);
}
