package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public interface SaveToFile {

    static void saveToFile(Order order) {
        SaveToFileSources sources = new SaveToFileSources(order);
        String fileName = sources.getFileName();
        String fileBody = sources.getFileBody();

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(fileBody);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

