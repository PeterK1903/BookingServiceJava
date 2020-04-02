package com.example.codeclan.coursetracker;

import com.example.codeclan.coursetracker.models.Booking;
import com.example.codeclan.coursetracker.models.Course;
import com.example.codeclan.coursetracker.models.Customer;
import com.example.codeclan.coursetracker.repositories.BookingRepository;


import com.example.codeclan.coursetracker.repositories.CourseRepository;
import com.example.codeclan.coursetracker.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CoursetrackerApplicationTests {
	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindBookingByDate(){
		List<Booking> foundBookings = bookingRepository.findByDate("13-04-20");
	}

	@Test
	public void getCustomerByCourse(){
		List<Customer> foundCustomer = customerRepository.findByBookingsCourseName("Java");
	}

	@Test
	public void getCoursesByRating(){
		List<Course> foundCourses = courseRepository.findByStarRating(5);
	}

	@Test
	public void getAllCoursesByCustomerName(){
		List<Course> foundCourses = courseRepository.findByBookingsCustomerName("Janice");
	}

}
