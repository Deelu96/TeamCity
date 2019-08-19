package com.interblocks;

public class App {
    private String message;

    // Constructor
    // @param message to be printed
    public App(String message) {
        this.message = message;
    }

    // prints the message
    public String printMessage() {
        return message;
    }

    // add "Hi!" to the message
    public String salutationMessage() {
        message = "Hi!" + message;
        return message;
    }
}
