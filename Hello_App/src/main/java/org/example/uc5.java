package org.example;

public class uc5 {
    public static void main(String[] args) {

        String result = String.join(", ", args);
        result = result.isEmpty() ? "World" : result;

        System.out.println("Hello, " + result + "!");
    }
}

