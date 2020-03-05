package com.springpay.cucumber.demo;

import com.springpay.cucumber.demo.entity.Account;
import com.springpay.cucumber.demo.repository.IAccountRepository;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

/**
 * Class to use spring application context while running cucumber
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ContextConfiguration(classes = DemoApplication.class, loader = SpringBootContextLoader.class)
public abstract class CucumberSpringContextConfiguration {
    private static final Logger log = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);
}

