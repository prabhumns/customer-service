package com.prabhu.customerservice.repos;

import com.prabhu.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    Customer findCustomerByName(String name);

    Customer findCustomerByUsername(String username);
}
