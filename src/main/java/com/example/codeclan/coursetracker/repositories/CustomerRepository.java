package com.example.codeclan.coursetracker.repositories;

import com.example.codeclan.coursetracker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
