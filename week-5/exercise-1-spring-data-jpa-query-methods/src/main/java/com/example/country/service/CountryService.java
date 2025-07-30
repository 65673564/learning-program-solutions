package com.example.country.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.country.model.Country;
import com.example.country.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> searchByName(String text) {
        return countryRepository.findByNameContaining(text);
    }

    public List<Country> searchByNameSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    public List<Country> getCountriesByAlphabet(char alphabet) {
        return countryRepository.findByNameStartingWith(String.valueOf(alphabet));
    }
}
