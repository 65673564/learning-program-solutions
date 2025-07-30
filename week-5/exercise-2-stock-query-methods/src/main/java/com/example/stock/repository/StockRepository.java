package com.example.stock.repository;

import com.example.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    // Facebook stocks in Sep 2019
    List<Stock> findByCodeAndDateBetween(String code, LocalDate start, LocalDate end);

    // Google stocks > 1250
    List<Stock> findByCodeAndCloseGreaterThan(String code, double close);

    // Top 3 volume
    List<Stock> findTop3ByOrderByVolumeDesc();

    // Bottom 3 Netflix stocks
    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}
