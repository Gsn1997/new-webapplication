package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PatientDetails {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String disease;



}
