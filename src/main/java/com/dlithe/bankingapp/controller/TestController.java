package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.PatientDetails;

import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("product-details/{productName}")
    public String my1Method(@PathVariable String productName) {
        return testService.productDetails(productName);


    }
    @PostMapping("register-patient")
    public String registerNewPatient (@RequestBody PatientDetails patientDetails) {
        return testService.registerPatient(patientDetails);

    }
}



