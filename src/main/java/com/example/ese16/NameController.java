package com.example.ese16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devname")

public class NameController {
    @GetMapping
    public String devName() {
        return "hala";
    }
}
