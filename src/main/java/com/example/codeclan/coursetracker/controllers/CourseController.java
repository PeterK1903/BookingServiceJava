package com.example.codeclan.coursetracker.controllers;


import com.example.codeclan.coursetracker.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity findCoursesByStarRatingAndCustomer(
            @RequestParam(required = false, name = "rating") Integer rating,
            @RequestParam(required = false, name = "name") String name
    ){
        if(rating != null){
            return new ResponseEntity(courseRepository.findByStarRating(rating), HttpStatus.OK);
        }
        if(name != null){
            return new ResponseEntity(courseRepository.findByBookingsCustomerName(name), HttpStatus.OK);
        }
        return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);
    }
}
