package ru.michaelshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.michaelshell.service.AnotherService;

@SpringBootApplication
public class StarterProfileApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterProfileApplication.class, args);
        System.out.println(context.getBean(AnotherService.class).getSomeService());
    }
}
