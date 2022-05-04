package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.BaseResponse;
import com.dlithe.bankingapp.dto.PhoneDto;
import com.dlithe.bankingapp.entity.Phone;
import com.dlithe.bankingapp.repository.PhoneDAO;
import com.dlithe.bankingapp.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    /*@Override
    public String registerPhone(PhoneDto phoneDto) {
        Phone phoneEntity = new Phone();
        phoneEntity.setFirstName(phoneDto.getFirstName());
        phoneEntity.setLastName(phoneDto.getLastName());
        phoneEntity.setMobileNumber(phoneDto.getMobileNumber());
        phoneEntity.setEmailId(phoneDto.getEmailId());

        phoneDAO.save(phoneEntity);


        return "Saved";
    }
*/
   /* @Override
    public PhoneDto getPhone(int userId) {
        Optional<Phone> phone = phoneDAO.findById(userId);
        PhoneDto phoneDto =new PhoneDto();

        phoneDto.setFirstName(phone.get().getFirstName());
        phoneDto.setLastName(phone.get().getLastName());
        phoneDto.setMobileNumber(phone.get().getMobileNumber());
        phoneDto.setEmailId(phone.get().getEmailId());

        return phoneDto;
    }*/

    @Override
    public ResponseEntity<BaseResponse> findPhoneDetails(int userId) {
        BaseResponse baseResponse = new BaseResponse();
        PhoneDto phoneDto=new PhoneDto();

        Optional<Phone> phone = phoneDAO.findById(userId);
        if (!phone.isPresent()){
            baseResponse.setMessage("given phone not found");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());

            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.NOT_FOUND);

        }
        Phone phoneDetails = phone.get();

//        phoneDto.setFirstName(phoneDetails.getFirstName());
//        phoneDto.setLastName(phoneDetails.getLastName());

        baseResponse.setMessage("successfully fetched");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(phoneDetails);

        return new  ResponseEntity<BaseResponse>(baseResponse,HttpStatus.OK);
    }


}
