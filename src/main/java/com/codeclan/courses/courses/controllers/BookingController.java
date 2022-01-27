package com.codeclan.courses.courses.controllers;

import com.codeclan.courses.courses.models.Booking;
import com.codeclan.courses.courses.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bookings/getbydate")
    public ResponseEntity<List<Booking>> getBookingsByDate(@RequestParam(name = "date") String date){
        return new ResponseEntity<>(bookingRepository.findBookingsByDate(date), HttpStatus.OK);
    }


}
