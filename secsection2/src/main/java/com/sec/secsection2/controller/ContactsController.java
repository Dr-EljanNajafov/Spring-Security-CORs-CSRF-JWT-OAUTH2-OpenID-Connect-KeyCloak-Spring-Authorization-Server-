package com.sec.secsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @GetMapping("/contact")
    public String getContactInquiryDetails() {
        return "Here are the contact details from DB";
    }
}
