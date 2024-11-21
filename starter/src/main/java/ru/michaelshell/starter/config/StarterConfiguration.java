package ru.michaelshell.starter.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import ru.michaelshell.service.SomeService;
import ru.michaelshell.starter.service.SomeServiceStarterImpl;

@AutoConfiguration
@Profile("starter")
public class StarterConfiguration {

    @Bean
    public SomeService someService() {
        return new SomeServiceStarterImpl();
    }
}
