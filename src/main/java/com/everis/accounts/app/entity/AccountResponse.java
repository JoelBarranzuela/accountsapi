package com.everis.accounts.app.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("Api account")
public class AccountResponse {
  @ApiModelProperty(example = "1111222233334441XXX")
  private String accountNumber;
  @ApiModelProperty(example = "1000")
  private Double amount;

}
