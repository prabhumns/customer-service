package com.prabhu.customerservice.controllers.ExceptionHandlers;

import com.prabhu.customerservice.exception.CustomerNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */

@ControllerAdvice
public class NoUserHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handlingResponse(CustomerNotFound exception){

        return new ResponseEntity<>(new ErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND.value(), new Date()),
                HttpStatus.NOT_FOUND);
    }

}
