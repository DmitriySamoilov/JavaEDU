package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

import static ru.geekbrains.lesson6.srp2.ScannerAsker.askScanner;

public abstract class OrderSaverToJSON {
    public static String saveToJson(Order order) {
        StringBuilder fileBody = new StringBuilder();
        fileBody.append("{\n");
        fileBody.append("\"clientName\":\"").append(order.getClientName()).append("\",\n");
        fileBody.append("\"product\":\"").append(order.getProduct()).append("\",\n");
        fileBody.append("\"qnt\":").append(order.getQnt()).append(",\n");
        fileBody.append("\"price\":").append(order.getPrice()).append("\n");
        fileBody.append("}\n");
        return fileBody.toString();
    }
}
