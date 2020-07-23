package com.sapiens.bdms.security.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityContextSwitchApplication {

    @GetMapping("/")
    public String welcome() {
        return "Security Works for multiple Entry Point !";
    }

    public static void main(String[] args) {
        SpringApplication.run(SecurityContextSwitchApplication.class, args);
    }

}
