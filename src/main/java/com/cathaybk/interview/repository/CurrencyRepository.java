package com.cathaybk.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cathaybk.interview.entity.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, String> {
}
