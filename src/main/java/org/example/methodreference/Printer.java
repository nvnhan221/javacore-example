package org.example.methodreference;

import java.util.function.Consumer;

public class Printer {

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Consumer<String> lambdaPrint = message -> printer.printMessage(message);

        Consumer<String> methodRefPrint = printer::printMessage;
        methodRefPrint.accept("Hello method reference!");

    }
}
