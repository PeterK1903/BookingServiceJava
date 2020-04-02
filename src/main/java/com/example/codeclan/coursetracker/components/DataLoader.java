package com.example.codeclan.coursetracker.components;

import com.example.codeclan.coursetracker.models.Booking;
import com.example.codeclan.coursetracker.models.Course;
import com.example.codeclan.coursetracker.models.Customer;
import com.example.codeclan.coursetracker.repositories.BookingRepository;
import com.example.codeclan.coursetracker.repositories.CourseRepository;
import com.example.codeclan.coursetracker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer bob = new Customer("Bob", "Giffnock", 54);
        customerRepository.save(bob);
        Customer sandra = new Customer("Sandra", "Bearsden", 35);
        customerRepository.save(sandra);
        Customer janice = new Customer("Janice", "Paisley" ,21);
        customerRepository.save(janice);

        Course python = new Course("Python", "Glasgow", 5);
        courseRepository.save(python);
        Course java = new Course("Java", "Edinburgh", 5);
        courseRepository.save(java);
        Course ruby = new Course("Ruby", "Glasgow", 1);
        courseRepository.save(ruby);

        Booking booking1 = new Booking("13-04-20", python, bob);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("30-05-20", java, sandra);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("24-08-20", ruby, janice);
        bookingRepository.save(booking3);

    }
}
