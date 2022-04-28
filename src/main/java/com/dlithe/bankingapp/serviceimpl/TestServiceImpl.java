package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.PatientDetails;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String productDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "tv":
                    return "Television, sometimes shortened to TV or telly, is a telecommunication medium used for transmitting moving images in black-and-white or in color";
                case "fridge":
                    return "A refrigerator is an essential home appliance for all seasons";
                case "mobile":
                    return "A mobile phone, cellular phone, cell phone, cellphone, headphone, hand phone or pocket phone, sometimes shortened to simply mobile, cell, or just phone";
                case "ac":
                    return "An evaporative cooler is a device that cools air through the evaporation of water. Evaporative cooling";
                default:
                    return "NO PRODUCT FOUND";

            }
        } else {
            return "Product cannot be Empty";

        }


    }

    @Override
    public String registerPatient(PatientDetails patientDetails) {
        System.out.println(patientDetails);
        return null;
    }


}

