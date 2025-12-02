package com.belen.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //telling Spring this class responds to user request
public class HelloController {
    @GetMapping("/") //homepage
    public String greeting(Model model) { //combined w/ templates like hashmap

        String name = "BA";//value
        model.addAttribute("name", name);

        return "hello";//all request start w/ 127.0.0.1 //returns the hello,mustache method
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }


}

