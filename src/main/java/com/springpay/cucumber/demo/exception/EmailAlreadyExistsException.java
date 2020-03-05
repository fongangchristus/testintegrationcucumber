package com.springpay.cucumber.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailAlreadyExistsException extends RuntimeException {

    private static Logger log = LoggerFactory.getLogger(EmailAlreadyExistsException.class);

    public EmailAlreadyExistsException(String email) {
        throw new RuntimeException("this email "+email + "Already exist");
    }
}
