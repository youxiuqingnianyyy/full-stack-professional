package com.amigoscode.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCDController {

    record TestCD(String test){}

    @GetMapping("/test")
    public TestCD getTestCD() {
        return new TestCD("Test");
    }
}
