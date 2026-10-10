package uk.ac.westminster.product_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/hello")

    public String hello(){
        return "Hello From Spring!";
    }

    @GetMapping("/status")

    public String status(){
        return LocalDate.now().toString();
    }

    @GetMapping("/goodbye")


    public String goodbye(){
        return "Goodbye from Spring Boot!";
    }
}
