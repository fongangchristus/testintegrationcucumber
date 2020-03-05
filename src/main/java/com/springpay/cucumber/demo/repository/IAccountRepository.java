package com.springpay.cucumber.demo.repository;

import com.springpay.cucumber.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
}
