package com.prabhu.customerservice.exception;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */


public class CustomerNotFound extends Throwable{

    public CustomerNotFound(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
    
}
