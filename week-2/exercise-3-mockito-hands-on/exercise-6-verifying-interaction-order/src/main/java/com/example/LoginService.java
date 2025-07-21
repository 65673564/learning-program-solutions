package com.example;

public class LoginService {

    private Logger logger;

    public LoginService(Logger logger) {
        this.logger = logger;
    }

    public void login(String username) {
        logger.start();
        logger.log("User " + username + " logging in");
        logger.end();
    }
}
