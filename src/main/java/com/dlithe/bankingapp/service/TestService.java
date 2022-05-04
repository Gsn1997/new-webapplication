package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.PatientDetails;
import com.dlithe.bankingapp.dto.PatientDetailsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    ResponseEntity<BaseResponse> findUserDetails(int id);

   /* String productDetails(String productName);

    String registerPatient(PatientDetails patientDetails);*/

//    PatientDetailsResponse getPatientDetailsResponse(int userId);

   /* PatientDetailsResponse fetchPatientDetailsResponseByUserName(String name);

    PatientDetailsResponse fetchPatientDetailsResponseById(int id);

    PatientDetailsResponse fetchPatientDetailsResponseByNameId(String name,int id);*/

}
