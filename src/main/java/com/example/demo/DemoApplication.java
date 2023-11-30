package com.example.demo;

import com.example.demo.config.PizzaConfig;
import com.example.demo.services.ColourPrinter;
import com.example.demo.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;
	private PizzaConfig pizzaConfig;

	public DemoApplication(ColourPrinter colourPrinter, PizzaConfig pizzaConfig) {
		this.colourPrinter = colourPrinter;
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info(colourPrinter.print());

		log.info(
				String.format("I want a %s crust pizza, with %s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce()
				));


	}

}
