package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {
        int totalsum = 0;
        for (int i = 0; i < 10; i++) {
            // int totalsum heeft hier een scope binnen de for-lus. We willen hem echter buiten de for-lus kunnen
            // aanroepen. Daarom verplaatsen we de declaratie naar buiten de for-lus.
            // int totalsum = 0;
            Random random = new Random();
            totalsum = totalsum + random.nextInt();
        }
        System.out.println("De som van alle random-getallen is: " + totalsum);
    }
}
