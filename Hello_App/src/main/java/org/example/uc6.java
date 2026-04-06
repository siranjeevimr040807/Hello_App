package org.example;

public class uc6 {
    public static void main(String[] args) {

        // Join all names with comma
        String names = String.join(", ", args);

        // Default to "World" if empty (no if-else)
        names = names.isEmpty() ? "World" : names;

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}

