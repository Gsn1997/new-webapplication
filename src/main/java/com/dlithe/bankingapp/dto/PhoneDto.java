package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class PhoneDto {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailId;
}
