package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDAO  extends JpaRepository<Phone,Integer> {

}
