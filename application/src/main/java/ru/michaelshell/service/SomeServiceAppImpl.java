package ru.michaelshell.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceAppImpl implements SomeService {

    @PostConstruct
    private void init() {
        System.out.println("Hello from SomeServiceAppImpl");
    }
}
