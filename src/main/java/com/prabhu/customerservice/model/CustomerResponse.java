package com.prabhu.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    private String username;

    private String name;

    private int accountBalance;


}
