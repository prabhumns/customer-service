package com.prabhu.customerservice.service;

import com.prabhu.customerservice.model.CustomerRequest;
import com.prabhu.customerservice.model.CustomerResponse;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */

public interface CustomerService {
    public Iterable<CustomerResponse> getAllCustomer();

    public CustomerResponse getByUsername(String username);


    CustomerResponse getByName(String name);

    void saveCustomer(CustomerRequest customerRequest);
}
