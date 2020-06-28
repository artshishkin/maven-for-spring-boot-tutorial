package com.artarkatesoft.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @GetMapping("/")
    public String getAddress() {
        return "hello";
    }
}
