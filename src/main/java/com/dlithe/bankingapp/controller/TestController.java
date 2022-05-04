package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.PatientDetails;

import com.dlithe.bankingapp.dto.PatientDetailsResponse;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

   /* @GetMapping("product-details/{productName}")
    public String my1Method(@PathVariable String productName) {
        return testService.productDetails(productName);


    }*/
    /*@PostMapping("register-patient")
    public String registerNewPatient (@RequestBody PatientDetails patientDetails) {
        return testService.registerPatient(patientDetails);

    }*/
    /*@GetMapping("get-patient-details/{userId}")
    public PatientDetailsResponse fetchPatientDetailsResponse(@PathVariable int userId){
        return testService.getPatientDetailsResponse(userId);
    }*/
//    @GetMapping("fetch-user-details/{name}")
//    public PatientDetailsResponse fetchPatientDetailsResponse(@PathVariable String name ){
//        return testService.fetchPatientDetailsResponseByUserName(name);
//    }
    /*@GetMapping("fetch-user-details/{id}")
    public PatientDetailsResponse fetchPatientDetailsResponse(@PathVariable int id){
        return testService.fetchPatientDetailsResponseById(id);
    }*/

    /*@GetMapping("fetch-details/{name}/{id}")
    public PatientDetailsResponse fetchPatientDetailsResponseByNameId(@PathVariable String name,@PathVariable int id){
        return testService.fetchPatientDetailsResponseByNameId(name,id);
    }*/

    @GetMapping("fetch-user-details/{id}")
    public ResponseEntity<BaseResponse> getUserDetails(@PathVariable int id){
        if(id==0 ||String.valueOf(id)==null){
            BaseResponse baseResponse=new BaseResponse();
            baseResponse.setMessage("incorret id");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

            return new ResponseEntity<BaseResponse>(HttpStatus.BAD_REQUEST);

        }

        return testService.findUserDetails(id);
    }


}

