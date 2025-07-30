package com.example.ormlearn;

import com.example.ormlearn.entity.Country;
import com.example.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
    }

    private void testAddCountry() {
        Country country = new Country("XY", "Xyloland");
        countryService.addCountry(country);

        Country added = countryService.findCountryByCode("XY");

        if (added != null && "Xyloland".equals(added.getName())) {
            System.out.println("Country added successfully: " + added);
        } else {
            System.out.println("Failed to add country.");
        }
    }
}
