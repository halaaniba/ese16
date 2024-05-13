package com.example.ese16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/devName")
    public String devName(){
        return ("hello");
    }
}
