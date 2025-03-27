package com.example.bcassist.demo.repository;

import com.example.bcassist.demo.model.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FAQRepository extends JpaRepository<FAQ, Long> {
}
