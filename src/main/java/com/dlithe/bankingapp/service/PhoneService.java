package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.PhoneDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface PhoneService {

    String registerPhone(PhoneDto phoneDto);




    PhoneDto getPhone(int userId);


    ResponseEntity<BaseResponse> findPhoneDetails(int userId);
}
