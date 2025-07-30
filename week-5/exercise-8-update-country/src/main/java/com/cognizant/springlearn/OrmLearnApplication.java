private static void updateCountryTest() {
    LOGGER.info("Start");

    try {
        countryService.updateCountry("IN", "Bharat");
    } catch (CountryNotFoundException e) {
        e.printStackTrace();
    }

    LOGGER.info("End");
}
public static void main(String[] args) {
    context = SpringApplication.run(OrmLearnApplication.class, args);
    countryService = context.getBean(CountryService.class);

    // Call update method test
    updateCountryTest();
}
