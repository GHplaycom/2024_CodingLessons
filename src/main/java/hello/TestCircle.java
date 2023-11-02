package main.java.hello;

import java.util.Scanner;

public class TestCircle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String... varArgs) {

        System.out.println("What are your radius?");

        double radius = scanner.nextDouble();

        System.out.println(radius);
    }
}
