package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demosaludar")
    public String saludar(){
        return "Hola DECELSoft y Compañeros";
    }
}
