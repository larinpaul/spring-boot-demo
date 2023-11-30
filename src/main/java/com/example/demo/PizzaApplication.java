package com.example.demo;

import com.example.demo.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PizzaApplication {

    public static void main(String[] args) {
//        SpringApplication.run(PizzaApplication.class, args);
        PizzaApplication.run(PizzaApplication.class, args);
    }

//    @Override
    public static void run(Class<PizzaApplication> pizzaApplicationClass, final String... args) {
        final PizzaConfig pizzaConfig = new PizzaConfig(
                "tomato", "mozzarella", "thin"
        );

        log.info(
                String.format("I want a %s crust pizza, with %s and %s sauce",
                pizzaConfig.getCrust(),
                pizzaConfig.getTopping(),
                pizzaConfig.getSauce()
                ));
    }
}
