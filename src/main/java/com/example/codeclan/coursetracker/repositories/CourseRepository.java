package com.example.codeclan.coursetracker.repositories;

import com.example.codeclan.coursetracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByStarRating(int rating);

    List<Course> findByBookingsCustomerName(String name);

}
