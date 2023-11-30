package com.example.demo.services.impl;

import com.example.demo.services.BluePrinter;
import org.springframework.stereotype.Service;

//@Service
public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "azul";
    }

}
