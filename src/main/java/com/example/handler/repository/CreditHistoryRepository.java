package com.example.handler.repository;

import com.example.handler.entity.CreditHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditHistoryRepository extends JpaRepository<CreditHistory, Long> {

   List<CreditHistory> findAllBySurnameAndFirstNameAndDebtorTrue(
           String surname,
           String firstName
   );
   List<CreditHistory> findAllBySurnameAndFirstNameAndRatingLessThan(
           String surname,
           String firstName,
           int rating
   );

}