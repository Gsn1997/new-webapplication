package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.PatientDetails;
import com.dlithe.bankingapp.dto.PatientDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String productDetails(String productName);

    String registerPatient(PatientDetails patientDetails);

    PatientDetailsResponse getPatientDetailsResponse(int userId);
}
