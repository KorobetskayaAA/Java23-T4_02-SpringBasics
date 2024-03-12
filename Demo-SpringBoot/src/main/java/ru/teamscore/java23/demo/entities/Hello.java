package ru.teamscore.java23.demo.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    @Value("${app.defaultgreeting}")
    private String greeting = "Hello";
    private String name;


    public Hello() {
        name = "Guest";
    }

    public Hello(String name) {
        if (name == null) {
            name = "Guest";
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return getGreeting() + ", " + getName() + "!";
    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }
}
