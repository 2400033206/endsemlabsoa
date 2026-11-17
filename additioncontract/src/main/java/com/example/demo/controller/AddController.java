package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class AddController {

    @GetMapping("/ms/add")
    public Map<String, Integer> add(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2) {

        Map<String, Integer> response = new LinkedHashMap<>();
        response.put("num1", num1);
        response.put("num2", num2);
        response.put("result", num1 + num2);
        return response;
    }
}
