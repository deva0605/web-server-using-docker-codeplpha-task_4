package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("🚀 DevOps Server is starting up...");

        while (true) {
            System.out.println("Instance is running smoothly... [Health: " + getStatus() + "]");
            Thread.sleep(5000);
        }
    }

    // This is the new function we are adding to test!
    public static String getStatus() {
        return "UP";
    }
}