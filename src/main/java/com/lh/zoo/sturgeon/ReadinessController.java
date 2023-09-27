package com.lh.zoo.sturgeon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadinessController {
    @GetMapping(value = {"/readiness", "health"})
    public String readiness() {
        return "ok";
    }
}
