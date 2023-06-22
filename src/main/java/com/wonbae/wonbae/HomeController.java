package com.wonbae.wonbae;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
<<<<<<< HEAD
        return "home1";
=======
        return "home2-1";
>>>>>>> feature/2
    } 
}
