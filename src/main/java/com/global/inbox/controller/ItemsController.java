package com.global.inbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    @GetMapping
    private List<String> getAll() {
        return List.of("FirstItem","SecondItem","ThirdItem","FourthItem","FifthElementFrom");
    }
}
