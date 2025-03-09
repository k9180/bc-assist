package com.example.bcassist.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bcassist.demo.model.FAQ;

public interface FAQRepository extends JpaRepository<FAQ, Long> {
}
