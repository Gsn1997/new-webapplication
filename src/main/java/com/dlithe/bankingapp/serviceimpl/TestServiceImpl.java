package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.PatientDetails;
import com.dlithe.bankingapp.dto.PatientDetailsResponse;
import com.dlithe.bankingapp.dto.ReviewResponse;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {


    /*@Override
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


    }*/

    @Autowired
    private UserDAO userDAO;

   /* @Override
    public PatientDetailsResponse fetchPatientDetailsResponseByNameId(String name, int id) {
        PatientDetailsResponse patientDetailsResponse =new PatientDetailsResponse();
        User user= userDAO.findByNameId(name,id);
        patientDetailsResponse.setId(user.getId());
        patientDetailsResponse.setName(user.getName());
        patientDetailsResponse.setAge(user.getAge());
        patientDetailsResponse.setPlace(user.getPlace());

        return patientDetailsResponse;
    }*/

    @Override
    public ResponseEntity<BaseResponse> findUserDetails(int id) {
        User user= userDAO.findById(id);




        return null;
    }
//for fetch in only by id
    /*@Override
    public PatientDetailsResponse fetchPatientDetailsResponseById(int id) {
        PatientDetailsResponse patientDetailsResponse =new PatientDetailsResponse();
        User user= userDAO.findById(id);
        patientDetailsResponse.setId(user.getId());
        patientDetailsResponse.setName(user.getName());
        patientDetailsResponse.setAge(user.getAge());
        return patientDetailsResponse;
    }*/
////for fetch in only by name
    /*@Override
    public PatientDetailsResponse fetchPatientDetailsResponseByUserName(String userName) {
        PatientDetailsResponse patientDetailsResponse =new PatientDetailsResponse();

        User user =userDAO.findByName(userName);
        patientDetailsResponse.setId(user.getId());
        patientDetailsResponse.setName(user.getName());
        patientDetailsResponse.setAge(user.getAge());

        return patientDetailsResponse;
    }*/


    /*@Override
    public String registerPatient(PatientDetails patientDetails) {
        User user = new User();
        user.setName(patientDetails.getName());
        user.setAge(patientDetails.getAge());
        user.setPlace(patientDetails.getPlace());
        user.setDisease(patientDetails.getDisease());
        user.setMobileNumber(patientDetails.getMobile_num());


        userDAO.save(user);
        return "User Saved";
    }*/

    /*@Override
    public PatientDetailsResponse getPatientDetailsResponse(int userId) {
//        db call
        Optional<User> user = userDAO.findById(userId);
        PatientDetailsResponse patientDetailsResponse = new PatientDetailsResponse();
        List<ReviewResponse> reviewResponseList = new ArrayList<>();
        if (!user.isPresent()) {
            throw new NullPointerException("User not found");
        }
//        fetch
        User userFromDatabase = user.get();
        patientDetailsResponse.setId(userFromDatabase.getId());

        patientDetailsResponse.setName(userFromDatabase.getName());
        patientDetailsResponse.setAge(userFromDatabase.getAge());
        patientDetailsResponse.setDisease(userFromDatabase.getDisease());
        patientDetailsResponse.setPlace(userFromDatabase.getPlace());
        patientDetailsResponse.setMobileNumber(userFromDatabase.getMobileNumber());

        ReviewResponse reviewResponse = new ReviewResponse();
        reviewResponse.setDisease("stomach ace");
        reviewResponse.setDoctorName("Dr.Murthy");
        reviewResponse.setAdvice("take care of ur food");
        reviewResponse.setMedication("Liquiprin,panadol  anacin");

        ReviewResponse reviewResponse1 = new ReviewResponse();
        reviewResponse1.setDisease("Breathing Problem");
        reviewResponse1.setDoctorName("Dr Ashok");
        reviewResponse1.setAdvice("relax your neck and shloders");
        reviewResponse1.setMedication("Eklira");

        ReviewResponse reviewResponse2 = new ReviewResponse();
        reviewResponse2.setDisease("fever");
        reviewResponse2.setDoctorName("Dr. Mahesh");
        reviewResponse2.setAdvice("Reduce open to sunny");
        reviewResponse2.setMedication("dolo");

        reviewResponseList.add(reviewResponse);
        reviewResponseList.add(reviewResponse1);
        reviewResponseList.add(reviewResponse2);

        patientDetailsResponse.setReview(reviewResponseList);


        return patientDetailsResponse;
    }*/

    /*@Override
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
*/

}

