private static void updateCountryTest() {
    LOGGER.info("Start");

    try {
        countryService.updateCountry("IN", "Bharat");
    } catch (CountryNotFoundException e) {
        e.printStackTrace();
    }

    LOGGER.info("End");
}
