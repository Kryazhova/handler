package com.example.handler.repository;

import com.example.handler.entity.MortgageApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MortgageApplicationRepository extends JpaRepository<MortgageApplication, Long> {
    
}
