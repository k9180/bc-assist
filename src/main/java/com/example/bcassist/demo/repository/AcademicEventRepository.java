package com.example.bcassist.demo.repository;

import com.example.bcassist.demo.model.AcademicEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicEventRepository extends JpaRepository<AcademicEvent, Long> {
    // Custom query methods can go here
}
