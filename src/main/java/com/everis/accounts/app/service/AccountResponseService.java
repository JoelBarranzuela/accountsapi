package com.everis.accounts.app.service;

import com.everis.accounts.app.entity.AccountResponse;

import io.reactivex.Single;

public interface AccountResponseService {
  Single<AccountResponse> getAllAccounts(String cardNumber) throws InterruptedException;
}
