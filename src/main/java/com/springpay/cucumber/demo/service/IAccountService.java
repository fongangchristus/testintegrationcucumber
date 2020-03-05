package com.springpay.cucumber.demo.service;

import com.springpay.cucumber.demo.entity.Account;
import com.springpay.cucumber.demo.exception.EmailAlreadyExistsException;

/**
 * @author christus
 *
 */
public interface IAccountService {
    /**
     * Creation d'un compte
     *
     * @param account
     *            the account
     * @return the account
     */
    public Account createNewAccount(Account account) throws EmailAlreadyExistsException;
}
