package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.PatientDetails;
import com.dlithe.bankingapp.dto.PatientDetailsResponse;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Autowired
    private UserDAO userDAO;


    @Override
    public String registerPatient(PatientDetails patientDetails) {
        User user = new User();
        user.setName(patientDetails.getName());
        user.setAge(patientDetails.getAge());
        user.setPlace(patientDetails.getPlace());
        user.setDisease(patientDetails.getDisease());
        user.setMobile_num(patientDetails.getMobile_num());


        userDAO.save(user);
        return "User Saved";
    }

    @Override
    public PatientDetailsResponse getPatientDetailsResponse(int userId) {
        Optional<User> user = userDAO.findById(userId);
        if (!user.isPresent()) {
            throw new NullPointerException("User not found");
        }
        User userFromDatabase=user.get();
        PatientDetailsResponse patientDetailsResponse = new PatientDetailsResponse();
        patientDetailsResponse.setName(user.get().getName());
        patientDetailsResponse.setAge(user.get().getAge());

        return patientDetailsResponse;
    }


}

