package com.farzad.droolsexample.controller;

import com.farzad.droolsexample.model.Order;
import lombok.AllArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Drool")
@AllArgsConstructor
public class priorityController {

    private final KieSession session;

    @PostMapping("/priority")
    public Order priority(@RequestBody Order priority) {
        session.insert(priority);
        session.fireAllRules();
        return priority;
    }
}
