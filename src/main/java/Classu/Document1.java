package Classu;

import org.apache.poi.xwpf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Document1 {
    public static void saveToWord(List<String> items, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            XWPFDocument document = new XWPFDocument();

            // Створюємо нову таблицю з одним рядом і двома стовпцями
            XWPFTable table = document.createTable(1, 2);
            // Задаємо ширину стовпців
            table.setWidth("100%");
            table.getCTTbl().addNewTblGrid().addNewGridCol().setW(5000);
            table.getCTTbl().getTblGrid().addNewGridCol().setW(5000);

            // Заповнюємо заголовки стовпців
            table.getRow(0).getCell(0).setText("Назва захворювання");
            table.getRow(0).getCell(1).setText("Ймовірність успадкування");

            // Додаємо дані в таблицю
            for (String item : items) {
                String[] parts = item.split(": ");
                String name = parts[0];
                String probability = parts[1].replaceAll("%", "");

                // Створюємо новий ряд у таблиці
                XWPFTableRow row = table.createRow();
                row.getCell(0).setText(name);
                row.getCell(1).setText(probability);
            }

            // Записуємо вміст документа у файл
            document.write(fos);
            System.out.println("Файл збережено в " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}