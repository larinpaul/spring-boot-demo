package com.example.demo;

import com.example.demo.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO Yeaaah, this will probably not work, but hey, let's just continue like this...
@SpringBootApplication
@Log
public class PizzaApplication {

    public static void main(String[] args) {
//        SpringApplication.run(PizzaApplication.class, args);
        PizzaApplication.run(PizzaApplication.class, args);
    }

    private static PizzaConfig pizzaConfig;

    public PizzaApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig = pizzaConfig;
    }

//    @Override
    public static void run(Class<PizzaApplication> pizzaApplicationClass, final String... args) {

        log.info(
                String.format("I want a %s crust pizza, with %s and %s sauce",
                pizzaConfig.getCrust(),
                pizzaConfig.getTopping(),
                pizzaConfig.getSauce()
                ));
    }
}
