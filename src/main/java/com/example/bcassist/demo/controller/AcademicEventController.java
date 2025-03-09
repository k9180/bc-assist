package com.example.bcassist.demo.controller;

import com.example.bcassist.demo.model.AcademicEvent;
import com.example.bcassist.demo.repository.AcademicEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/academic-events")
public class AcademicEventController {

    @Autowired
    private AcademicEventRepository academicEventRepository;

    @GetMapping
    public List<AcademicEvent> getAllEvents() {
        return academicEventRepository.findAll();
    }

    @PostMapping
    public AcademicEvent createEvent(@RequestBody AcademicEvent event) {
        return academicEventRepository.save(event);
    }
}
