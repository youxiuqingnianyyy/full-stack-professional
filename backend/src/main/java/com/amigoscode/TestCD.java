package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCD {

    record Test(String result) {}

    @GetMapping("/test")
    public Test getTest() {
        return new Test("Test");
    }
}
