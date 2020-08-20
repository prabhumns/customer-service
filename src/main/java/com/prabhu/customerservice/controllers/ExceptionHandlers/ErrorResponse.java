package com.prabhu.customerservice.controllers.ExceptionHandlers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private int statusCode;
    private Date exceptionTime;
}
