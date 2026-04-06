package org.example;

public class uc7 {
    public static void main(String[] args) {

        // Join arguments with comma and space
        String names = String.join(", ", args);

        // Use default "World" if empty (no if-else)
        names = names.isEmpty() ? "World" : names;

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}

