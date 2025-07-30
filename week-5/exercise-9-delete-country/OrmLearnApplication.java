package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.springlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        CountryService countryService = context.getBean(CountryService.class);
        deleteCountryTest(countryService);
    }

    private static void deleteCountryTest(CountryService countryService) {
        LOGGER.info("Start deleteCountryTest");
        countryService.deleteCountry("ZZ"); // Use the same code added in Add Country exercise
        LOGGER.info("Deleted Country with code ZZ");
        LOGGER.info("End deleteCountryTest");
    }
}
