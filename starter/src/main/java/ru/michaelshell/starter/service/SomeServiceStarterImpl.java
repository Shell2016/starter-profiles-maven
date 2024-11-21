package ru.michaelshell.starter.service;

import jakarta.annotation.PostConstruct;
import ru.michaelshell.service.SomeService;

public class SomeServiceStarterImpl implements SomeService {

    @PostConstruct
    private void init() {
        System.out.println("Hello from SomeServiceStarterImpl");
    }
}
