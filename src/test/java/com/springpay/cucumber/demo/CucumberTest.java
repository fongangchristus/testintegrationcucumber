package com.springpay.cucumber.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

/**
 * To run cucumber test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features",
                 glue = {"com.springpay.cucumber.demo"},
                 plugin = {"pretty", "html:cucumber-report"})
public class CucumberTest {

}