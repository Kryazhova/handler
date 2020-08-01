package com.example.handler.repository;

import com.example.handler.entity.MortgageApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MortgageApplicationRepository extends JpaRepository<MortgageApplication, Long> {
    
}
