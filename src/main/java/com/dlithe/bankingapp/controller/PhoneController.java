package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.PhoneDto;
import com.dlithe.bankingapp.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    /*@PostMapping("register-phone")
    public String register(@RequestBody PhoneDto phoneDto) {
        return phoneService.registerPhone(phoneDto);
    }*/


    @GetMapping("get-phone/{userId}")
    public PhoneDto fetchPhone(@PathVariable int userId){
        return phoneService.getPhone(userId);
    }

    @GetMapping("fetch-phone-details/{userId}")
    public ResponseEntity<BaseResponse> getPhoneDetails(@PathVariable int userId){
        if(userId == 0 || String.valueOf(userId) == null){
            BaseResponse baseResponse=new BaseResponse();
            baseResponse.setMessage("incorrect id input cannot be zero or null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.BAD_REQUEST);

        }

        return phoneService.findPhoneDetails(userId);
    }

}
