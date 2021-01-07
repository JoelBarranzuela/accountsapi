package com.everis.accounts.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.accounts.app.entity.AccountResponse;
import com.everis.accounts.app.service.AccountResponseServiceImpl;

import io.reactivex.Single;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/core/accounts")
@ApiModel("/core/accounts")
public class AccountsController {
  @Autowired
  AccountResponseServiceImpl service;

  @GetMapping
  @ApiOperation(value = "Cuentas de una tarjeta",response = AccountResponse.class)
  @ApiResponse(code = 200, message = "Success", response = AccountResponse.class) 
  public Single<AccountResponse> getAccounResponseByCardNumber(@RequestParam(name = "cardNumber") String cardNumber) throws InterruptedException {
    return service.getAllAccounts(cardNumber);
  }
}
