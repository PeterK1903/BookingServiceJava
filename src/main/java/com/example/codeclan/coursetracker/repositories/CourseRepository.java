package com.example.codeclan.coursetracker.repositories;

import com.example.codeclan.coursetracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
