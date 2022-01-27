package com.codeclan.courses.courses.controllers;

import com.codeclan.courses.courses.models.Customer;
import com.codeclan.courses.courses.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

//    @GetMapping(value = "customer/courses")
//    public ResponseEntity<List<Customer>> findCustomersByCourseName(
//            @RequestParam(name = "id", required = false) Long id
//    ){
//        return new ResponseEntity<>(customerRepository.findByBookingsCourseId(id), HttpStatus.OK);
//    }

}
