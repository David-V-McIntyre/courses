package com.codeclan.courses.courses.components;

import com.codeclan.courses.courses.models.Booking;
import com.codeclan.courses.courses.models.Course;
import com.codeclan.courses.courses.models.Customer;
import com.codeclan.courses.courses.repositories.BookingRepository;
import com.codeclan.courses.courses.repositories.CourseRepository;
import com.codeclan.courses.courses.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Python", "Glasgow", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Javascript", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Java", "Glasgow", 5);
        courseRepository.save(course3);

        Course course4 = new Course("Python", "Edinburgh", 4);
        courseRepository.save(course4);

        Course course5 = new Course("Javascript", "Edinburgh", 5);
        courseRepository.save(course5);

        Course course6 = new Course("Java", "Edinburgh", 5);
        courseRepository.saveAndFlush(course6);




        Customer customer1 = new Customer("David", "Glasgow", 33);
        customerRepository.save(customer1 );

        Customer customer2 = new Customer("Michael", "Glasgow", 21);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Nicole", "Edinburgh", 19);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Gavin", "Edinburgh", 24);
        customerRepository.saveAndFlush(customer4);

        Booking booking1 = new Booking("12/03/2022", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("12/04/2022", course2, customer1);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("12/05/2022", course3, customer1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("12/03/2022", course1, customer2);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("12/04/2022", course2, customer2);
        bookingRepository.save(booking5);
        Booking booking6 = new Booking( "12/05/2022", course3, customer2);
        bookingRepository.save(booking6);

        Booking booking7 = new Booking( "12/03/2022", course4, customer3);
        bookingRepository.save(booking7);
        Booking booking8 = new Booking( "12/04/2022", course5, customer3);
        bookingRepository.save(booking8);
        Booking booking9 = new Booking( "12/05/2022", course6, customer3);
        bookingRepository.save(booking9);

        Booking booking10 = new Booking( "12/03/2022", course4, customer4);
        bookingRepository.save(booking10);
        Booking booking11 = new Booking( "12/04/2022", course5, customer4);
        bookingRepository.save(booking11);
        Booking booking12 = new Booking( "12/05/2022", course6, customer4);
        bookingRepository.save(booking12);

        customer1.addBooking(booking1);
        customer1.addBooking(booking2);
        customer1.addBooking(booking3);
        customerRepository.save(customer1);

        customer2.addBooking(booking4);
        customer2.addBooking(booking5);
        customer2.addBooking(booking6);
        customerRepository.save(customer2);

        customer3.addBooking(booking7);
        customer3.addBooking(booking8);
        customer3.addBooking(booking9);
        customerRepository.save(customer3);


        customer4.addBooking(booking10);
        customer4.addBooking(booking11);
        customer4.addBooking(booking12);
        customerRepository.save(customer4);

        course1.addBooking(booking1);
        course1.addBooking(booking4);
        courseRepository.save(course1);

        course2.addBooking(booking2);
        course2.addBooking(booking5);
        courseRepository.save(course2);

        course3.addBooking(booking3);
        course3.addBooking(booking6);
        courseRepository.save(course3);

        course4.addBooking(booking7);
        course4.addBooking(booking10);
        courseRepository.save(course4);

        course5.addBooking(booking8);
        course5.addBooking(booking11);
        courseRepository.save(course5);

        course6.addBooking(booking9);
        course6.addBooking(booking12);
        courseRepository.save(course6);




    }
}
