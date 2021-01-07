package com.everis.accounts.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.accounts.app.entity.AccountResponse;

import io.reactivex.Single;

@Service
public class AccountResponseServiceImpl implements AccountResponseService {

  @Override
  public Single<AccountResponse> getAllAccounts(String cardNumber) throws InterruptedException {
    
    
    List<AccountResponse> accounts = Arrays.asList(
        new AccountResponse("1111222233334441", 1000.0),
        new AccountResponse("1111222233334442", 500.0),
        new AccountResponse("1111222233334443", 1500.0)
       );  

    List<AccountResponse> accountrpta = accounts;

    AccountResponse account = accountrpta.stream()
        .filter(acc -> acc.getAccountNumber().equals(cardNumber)).findFirst().map(accountR -> {
          accountR.setAccountNumber(accountR.getAccountNumber() + "XXX");
          return accountR;
        }).get();

    Thread.sleep(5000);
    return Single.just(account);
  }

}
