package ru.geekbrains.lesson6.srp2;

import static ru.geekbrains.lesson6.srp2.OrderSaverToJSON.saveToJson;
import static ru.geekbrains.lesson6.srp2.OrderSaverToXML.saveToXML;
import static ru.geekbrains.lesson6.srp2.ScannerAsker.askScanner;

public class SaveToFileSources {
    private String fileName = "";
    private String fileBody = "";

    public String getFileName() {
        return fileName;
    }

    public String getFileBody() {
        return fileBody;
    }

    public SaveToFileSources(Order order) {
        this.fileName = askScanner("Введите имя файла:");

        switch (Integer.parseInt(askScanner("Выбирети тип файла для сохранеия (1).JSON,(2).XML:"))) {
            case 2 -> {
                this.fileName += ".xml";
                this.fileBody = saveToXML(order);
            }
            default -> {
                this.fileName += ".json";
                this.fileBody = saveToJson(order);
            }
        }


    }
}
