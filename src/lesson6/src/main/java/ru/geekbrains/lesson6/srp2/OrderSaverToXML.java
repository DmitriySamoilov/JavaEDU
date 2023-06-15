package ru.geekbrains.lesson6.srp2;


import static ru.geekbrains.lesson6.srp2.ScannerAsker.askScanner;

public abstract class OrderSaverToXML {

    public static String saveToXML (Order order){
        StringBuilder fileBody = new StringBuilder();

        fileBody.append("<?xml version=\"1.0\"?>\n");
        fileBody.append("<order>\n");
        fileBody.append("  <clientName>").append(order.getClientName()).append("</clientName>\n");
        fileBody.append("  <product>").append(order.getProduct()).append("</product>\n");
        fileBody.append("  <qnt>").append(order.getQnt()).append("</qnt>\n");
        fileBody.append("  <price>").append(order.getPrice()).append("</price>\n");
        fileBody.append("</order>\n");
        return fileBody.toString();
    }
}
