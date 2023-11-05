package com.example.demo.config;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColourPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;
import com.example.demo.services.impl.ColourPrinterImpl;
import com.example.demo.services.impl.EnglishBluePrinter;
import com.example.demo.services.impl.EnglishGreenPrinter;
import com.example.demo.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }

}
