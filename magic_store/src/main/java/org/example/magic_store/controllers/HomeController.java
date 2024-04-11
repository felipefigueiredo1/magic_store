package org.example.magic_store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
public class HomeController {

    @GetMapping()
    public String home() {
        return "Home";
    }

    @GetMapping("/apps")
    public String[] apps() {
        return new String[]{"Strings", "Strings"};
    }
}
