package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

import static ru.geekbrains.lesson6.srp2.ScannerAsker.askScanner;

public abstract class OrderCreaterFromConsole {
    public static Order inputFromConsole(){
        String clientName = askScanner("Имя клиента: ");
        String product = askScanner("Продукт: ");
        int qnt = Integer.parseInt(askScanner("Кол-во: "));
        int price = Integer.parseInt(askScanner("Цена: "));
        return new Order(clientName,product,qnt,price);
    }
}
