package com.prabhu.customerservice.controllers;

import com.prabhu.customerservice.exception.CustomerNotFound;
import com.prabhu.customerservice.model.CustomerRequest;
import com.prabhu.customerservice.model.CustomerResponse;
import com.prabhu.customerservice.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */

@RestController
@RequestMapping("/api/customers")
public class CustomerController {



    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }


    @GetMapping
    public ResponseEntity<Iterable<CustomerResponse>> getAll(){

        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{username}")
    public ResponseEntity<CustomerResponse> byUsername(@PathVariable String username) throws CustomerNotFound {
        CustomerResponse cr = customerService.getByUsername(username);
        if(cr == null){
            throw new CustomerNotFound("Custormer with the username " + username + " is not found");
        }
        return new ResponseEntity<>(cr, HttpStatus.FOUND);
    }

    @GetMapping("/name/{customerName}")
    public ResponseEntity<CustomerResponse> byName(@PathVariable String customerName) throws CustomerNotFound {

        CustomerResponse cr = customerService.getByName(customerName);

        if(cr==null){
            throw new CustomerNotFound("Customer with the name " + customerName + " is not found");
        }
        return new ResponseEntity<>(cr, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity saveUser(@RequestBody CustomerRequest customerRequest){

        customerService.saveCustomer(customerRequest);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
