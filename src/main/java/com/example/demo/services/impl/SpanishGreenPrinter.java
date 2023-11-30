package com.example.demo.services.impl;

import com.example.demo.services.GreenPrinter;
import org.springframework.stereotype.Service;

//@Component
// The @Component has friends, for example, @Service, which is more descriptive, because we use @Service s at the Service level! :)
@Service
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "verde";
    }

}
