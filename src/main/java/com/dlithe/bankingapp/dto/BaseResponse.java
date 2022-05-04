package com.dlithe.bankingapp.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@ToString

public class BaseResponse {

    private String message;
    private HttpStatus httpStatus;//BAD REQUEST,NOT FOUND
    private int httpStatusCode;//400,404
    private Object response;

}
