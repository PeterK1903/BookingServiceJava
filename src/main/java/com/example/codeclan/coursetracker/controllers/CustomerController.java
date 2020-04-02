package com.example.codeclan.coursetracker.controllers;

import com.example.codeclan.coursetracker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public ResponseEntity findCustomersByCourse(
            @RequestParam(name = "coursename", required = false) String name
            ){
        if(name != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseName(name), HttpStatus.OK);
        }
        return new ResponseEntity(customerRepository.findAll(), HttpStatus.OK);
    }

}
