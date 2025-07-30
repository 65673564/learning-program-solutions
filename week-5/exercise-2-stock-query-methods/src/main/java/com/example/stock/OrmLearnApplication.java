package com.example.stock;

import com.example.stock.model.Stock;
import com.example.stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private StockRepository stockRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        getFacebookStockInSep2019();
        getGoogleStockAbove1250();
        getTop3ByVolume();
        getLowestNetflixStock();
    }

    private void getFacebookStockInSep2019() {
        LocalDate start = LocalDate.of(2019, 9, 1);
        LocalDate end = LocalDate.of(2019, 9, 30);
        List<Stock> list = stockRepository.findByCodeAndDateBetween("FB", start, end);
        list.forEach(System.out::println);
    }

    private void getGoogleStockAbove1250() {
        List<Stock> list = stockRepository.findByCodeAndCloseGreaterThan("GOOGL", 1250);
        list.forEach(System.out::println);
    }

    private void getTop3ByVolume() {
        List<Stock> list = stockRepository.findTop3ByOrderByVolumeDesc();
        list.forEach(System.out::println);
    }

    private void getLowestNetflixStock() {
        List<Stock> list = stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
        list.forEach(System.out::println);
    }
}
