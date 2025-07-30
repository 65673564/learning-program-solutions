package com.example.country.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.country.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Match text anywhere in name
    List<Country> findByNameContaining(String text);

    // Match text and sort ascending
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Match starting with alphabet
    List<Country> findByNameStartingWith(String prefix);
}
