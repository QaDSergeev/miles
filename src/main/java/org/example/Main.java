package org.example;

public class Main {

    public static void main(String[] args) {

        int ticketPrice = 1350;
        int milePrice = 20;
        int mileCount = ticketPrice / milePrice;

        System.out.printf("Число милей: %s%n",  mileCount);
    }
}