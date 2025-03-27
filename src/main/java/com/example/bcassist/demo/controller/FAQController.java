package com.example.bcassist.demo.controller;

import com.example.bcassist.demo.model.FAQ;
import com.example.bcassist.demo.repository.FAQRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faq")
@CrossOrigin(origins = "*")  // Allow frontend to access this API
@RequiredArgsConstructor  // Lombok auto-generates the constructor
public class FAQController {

    private final FAQRepository faqRepository;

    @GetMapping
    public List<FAQ> getAllFaqs() {
        return faqRepository.findAll();
    }

    @PostMapping
    public FAQ createFaq(@RequestBody FAQ faq) {
        return faqRepository.save(faq);
    }
}
