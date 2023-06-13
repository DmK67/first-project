package ru.practicum.module4_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaterController {
    @GetMapping("/test")
    public String test() {
        return "Ok! Spring Boot!";
    }

}
