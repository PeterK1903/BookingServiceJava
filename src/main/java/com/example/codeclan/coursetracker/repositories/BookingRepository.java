package com.example.codeclan.coursetracker.repositories;

import com.example.codeclan.coursetracker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {


}
