package com.springpay.cucumber.demo.service;

import com.springpay.cucumber.demo.entity.Account;
import com.springpay.cucumber.demo.exception.EmailAlreadyExistsException;
import com.springpay.cucumber.demo.repository.IAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;
    private static final Logger log = LoggerFactory.getLogger(IAccountServiceImpl.class);
    /*
     * (non-Javadoc)
     *
     * @see
     * fr.datafuture.testplus.api.service.IAccountService#createNewAccount(fr.
     * datafuture.testplus.api.model.Account)
     */
    @Override
    public Account createNewAccount(Account account)  {
        log.info("Creating account: "+account);
        Account accountFound = this.accountRepository.findByEmail(account.getEmail());
        if(accountFound!=null) {
            throw new EmailAlreadyExistsException(account.getEmail());
        }
        return this.accountRepository.save(account);
    }

}
