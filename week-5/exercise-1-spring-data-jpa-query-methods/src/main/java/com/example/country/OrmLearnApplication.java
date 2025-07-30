package com.example.country;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.country.model.Country;
import com.example.country.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testSearchByName();
        testSearchByNameSorted();
        testGetCountriesByAlphabet();
    }

    private static void testSearchByName() {
        LOGGER.info("Search by substring 'ou'...");
        List<Country> countries = countryService.searchByName("ou");
        countries.forEach(country -> LOGGER.debug("Country: {} - {}", country.getCode(), country.getName()));
    }

    private static void testSearchByNameSorted() {
        LOGGER.info("Search by substring 'ou' sorted ascending...");
        List<Country> countries = countryService.searchByNameSorted("ou");
        countries.forEach(country -> LOGGER.debug("Country: {} - {}", country.getCode(), country.getName()));
    }

    private static void testGetCountriesByAlphabet() {
        LOGGER.info("Search countries starting with Z...");
        List<Country> countries = countryService.getCountriesByAlphabet('Z');
        countries.forEach(country -> LOGGER.debug("Country: {} - {}", country.getCode(), country.getName()));
    }
}
