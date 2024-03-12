package ru.teamscore.java23.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.teamscore.java23.demo.entities.Hello;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(@RequestParam(required = false) String name) {
        return new Hello(name).toString();
    }

    @ResponseBody
    @GetMapping("/json")
    public Hello json(@RequestParam String name) {
        return new Hello(name);
    }
}
