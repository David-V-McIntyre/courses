package com.codeclan.courses.courses.controllers;

import com.codeclan.courses.courses.models.Course;
import com.codeclan.courses.courses.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses/rating")
    public ResponseEntity<List<Course>> findByRating (@RequestParam(name = "rating") int rating){
        return new ResponseEntity<>(courseRepository.findCoursesByRating(rating), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/customer")
    public ResponseEntity<List<Course>> findByBookingsCustomerId(@RequestParam(name = "customerId") Long customerId){
        return new ResponseEntity<>(courseRepository.findCoursesByBookingCustomerId(customerId), HttpStatus.OK);
    }



}
