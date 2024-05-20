package Classu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class Document {
    public static void saveToWord(List<String> data, String filePath) {
        try {
            // Створюємо потік для запису у файл
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "Cp1251"); // Кодировка для документа Word

            // Записуємо дані у файл
            for (String line : data) {
                outputStreamWriter.write(line + "\r\n"); // Додаємо переклад рядка
            }

            // Закриваємо потоки
            outputStreamWriter.close();
            fileOutputStream.close();

            System.out.println("Word файл збережено успішно.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
