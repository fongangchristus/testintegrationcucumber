package com.springpay.cucumber.demo;

import com.springpay.cucumber.demo.entity.Account;
import com.springpay.cucumber.demo.repository.IAccountRepository;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Class to use spring application context while running cucumber
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = DemoApplication.class, loader = SpringBootContextLoader.class)
public class CucumberSpringContextConfiguration {
    private static final Logger log = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);
    @Before
    public void setup_cucumber_spring_context(){
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
        //  log.info("--------------------------------------------------------------");
        log.info("--------Application context is loading for test---------------");
        // log.info("--------------------------------------------------------------");

    }
}

