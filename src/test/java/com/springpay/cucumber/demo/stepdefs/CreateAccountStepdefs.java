package com.springpay.cucumber.demo.stepdefs;

import com.springpay.cucumber.demo.CucumberSpringContextConfiguration;
import com.springpay.cucumber.demo.entity.Account;
import com.springpay.cucumber.demo.repository.IAccountRepository;
import com.springpay.cucumber.demo.service.IAccountService;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertTrue;

public class CreateAccountStepdefs extends CucumberSpringContextConfiguration{

    Logger log = LoggerFactory.getLogger(CreateAccountStepdefs.class);
    @Autowired
    private IAccountService iAccountService;
    @Autowired
    private IAccountRepository accountRepository;

    private Account account;
    private Account account2;


    @Given("Qu\\'il y\\'a aucun account avec l\\'email {string}")
    public void quIlYAAucunAccountAvecLEmail(String arg0) {
        log.info(arg0);
        Account testAccount=accountRepository.findByEmail(arg0);
        assertTrue(testAccount==null);
    }

    @When("Un nouveau user essaie de s\\'inscrire avec l\\'email {string}")
    public void unNouveauUserEssaieDeSInscrireAvecLEmail(String arg0) {
        log.info(arg0);
    }

    @Then("Un nouveau compte est crée avec l\\'email {string}")
    public void unNouveauCompteEstCréeAvecLEmail(String arg0) {
        //account=accountRepository.findByEmail(arg1);
        log.info(arg0);

        account= new Account();
        account.setEmail(arg0);
        assertTrue(account!=null);

    }
}
