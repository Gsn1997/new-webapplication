package com.dlithe.bankingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
     @GetMapping("Goutham")

    public String myMethod(){
         return "Hey guys!!! Its me, Spring-boot endpoint response";

     }

}
