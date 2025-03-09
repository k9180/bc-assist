package com.example.bcassist.demo.controller;

import com.example.bcassist.demo.model.FAQ;
import com.example.bcassist.demo.repository.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faq")
public class FAQController {

    private final FAQRepository faqRepository;

    public FAQController(FAQRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    @GetMapping
    public List<FAQ> getAllFaq(){
        return faqRepository.findAll();
    }

    @PostMapping
    public FAQ createFaq(@RequestBody FAQ faq){
        return faqRepository.save(faq);
    }

}


