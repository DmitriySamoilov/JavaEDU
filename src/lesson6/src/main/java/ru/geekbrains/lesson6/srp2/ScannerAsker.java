package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public abstract class ScannerAsker {
    private static Scanner scanner = new Scanner(System.in);
    public static String askScanner(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
