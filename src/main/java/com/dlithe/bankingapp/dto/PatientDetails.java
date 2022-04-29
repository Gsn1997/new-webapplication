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

    private String name;
    private int age;
    private String place;
    private String disease;
    private String mobile_num;


}
