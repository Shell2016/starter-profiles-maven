package ru.michaelshell.service;

import org.springframework.stereotype.Service;

@Service
public class AnotherService {

    private final SomeService someService;

    public AnotherService(SomeService someService) {
        this.someService = someService;
    }

    public SomeService getSomeService() {
        return someService;
    }
}
