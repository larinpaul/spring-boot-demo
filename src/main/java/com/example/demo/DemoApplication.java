package com.example.demo;

import com.example.demo.services.ColourPrinter;
import com.example.demo.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final ColourPrinter colourPrinter = new ColourPrinterImpl();
		log.info(colourPrinter.print());
	}

}
