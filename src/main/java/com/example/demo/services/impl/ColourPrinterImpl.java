package com.example.demo.services.impl;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColourPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component // If you wanted to replace English with Spanish, you'd have to remove @Component from the English classes and add the annotations to the Spanish classes
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }


}
