package com.spring.projekt.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HaloController {

    @GetMapping("/halo")
    public String sayHalo() {
        return "Halo, World!";
    }

    
    
}


          
