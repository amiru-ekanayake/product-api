package uk.ac.westminster.product_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")

    public String hello(){
        return "Hello From Spring!";
    }

    @GetMapping("/status")

    public int status(){
        return 200;
    }
}
