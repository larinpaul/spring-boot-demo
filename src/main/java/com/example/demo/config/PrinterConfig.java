package com.example.demo.config;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColourPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;
import com.example.demo.services.impl.ColourPrinterImpl;
import com.example.demo.services.impl.SpanishBluePrinter;
import com.example.demo.services.impl.SpanishGreenPrinter;
import com.example.demo.services.impl.SpanishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }

}
