package com.prabhu.customerservice.service;

import com.prabhu.customerservice.entity.Customer;
import com.prabhu.customerservice.model.CustomerRequest;
import com.prabhu.customerservice.model.CustomerResponse;
import com.prabhu.customerservice.repos.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepo repo;

    private ModelMapper mapper;

    private Type listType;

    public CustomerServiceImpl (CustomerRepo repo, ModelMapper mapper){
        this.listType = new TypeToken<List<CustomerResponse>>(){}.getType();
        this.mapper = mapper;
        this.repo = repo;
    }

    @Override
    public Iterable<CustomerResponse> getAllCustomer() {
        Iterable<Customer> customers = repo.findAll();
        return this.mapper.map(customers, listType);
    }

    @Override
    public CustomerResponse getByUsername(String username) {
        Customer customer = repo.findCustomerByUsername(username);
        if(customer == null)  return  null;
        return this.mapper.map(customer, CustomerResponse.class);
    }

    @Override
    public CustomerResponse getByName(String name) {
        Customer customer = repo.findCustomerByName(name);
        if(customer == null) return null;
        return this.mapper.map(customer, CustomerResponse.class);
    }

    @Override
    public void saveCustomer(CustomerRequest customerRequest) {
        Customer customer = this.mapper.map(customerRequest, Customer.class);
        repo.save(customer);

    }
}
