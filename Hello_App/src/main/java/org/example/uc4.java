package org.example;

public class uc4 {
    public static void main(String[] args) {

        // Use ternary operator instead of if-else
        String result = (args.length > 0)
                ? String.join(", ", args)
                : "World";

        // Display greeting
        System.out.println("Hello, " + result + "!");
    }
}

