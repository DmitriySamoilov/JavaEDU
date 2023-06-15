package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.srp2.Order;

import static ru.geekbrains.lesson6.srp2.OrderCreaterFromConsole.inputFromConsole;
import static ru.geekbrains.lesson6.srp2.SaveToFile.saveToFile;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order1= inputFromConsole();
        saveToFile(order1);

    }

}
