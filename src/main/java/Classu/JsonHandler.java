package Classu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JsonHandler {
    private static final String FILE_PATH = "src/main/resources/com/example/kurs_bets/data.json";

    public static void saveDataToJson(String[] textFieldsData, String comboBox1Data, String comboBox2Data) {
        // Створюємо об'єкт, який буде конвертувати об'єкти у JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Спочатку спробуємо прочитати вміст існуючого файлу JSON
        List<DataObject> dataList = readDataFromJson();

        // Створюємо новий об'єкт з новими даними
        DataObject newDataObject = new DataObject(textFieldsData, comboBox1Data, comboBox2Data);

        // Додаємо новий об'єкт до списку
        dataList.add(newDataObject);

        // Зберігаємо оновлений список у файлі
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            gson.toJson(dataList, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<DataObject> readDataFromJson() {
        // Перевіряємо, чи існує файл JSON
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        // Створюємо об'єкт, який буде конвертувати JSON у об'єкти
        Gson gson = new Gson();

        // Використовуємо TypeToken для отримання типу списку об'єктів
        Type dataListType = new TypeToken<List<DataObject>>() {}.getType();

        // Читаємо JSON з файлу і конвертуємо його у список об'єктів
        try (Reader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, dataListType);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Метод для додавання компонента в JSON файл
    public void addToHistory() {
        // Форматтер для часу та дати
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Отримуємо поточний час і дату та форматуємо його
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(formatter);

        // Компонент, який буде додано в історію
        String component = "Аналіз " + formattedDateTime;

        // Шлях до JSON файлу
        String filePath = "src/main/resources/com/example/kurs_bets/history.json";

        try {
            // Перевіряємо, чи існує файл
            Path path = Paths.get(filePath);
            if (!Files.exists(path)) {
                // Якщо файл не існує, створюємо його і записуємо в нього початковий JSON масив
                String initialJson = "";
                Files.writeString(path, initialJson);
            } else {
                // Якщо файл існує, видаляємо останню кому, якщо вона є
                String content = Files.readString(path);
                content = content.trim(); // Видаляємо пробільні символи на початку та в кінці
                if (content.endsWith(",")) {
                    content = content.substring(0, content.length() - 1); // Видаляємо останню кому
                }

                // Записуємо оновлений вміст файлу
                Files.writeString(path, content + "\n");
            }

            // Додаємо новий компонент у файл
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(component + "\n"); // Додаємо новий елемент у форматі рядка JSON без коми в кінці
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для читання компонентів з JSON файлу
    public List<String> readHistory() {
        // Шлях до JSON файлу
        String filePath = "src/main/resources/com/example/kurs_bets/history.json";
        List<String> history = new ArrayList<>();

        try {
            // Зчитуємо вміст JSON файлу
            String jsonContent = Files.readString(Paths.get(filePath));
            // Видаляємо останній символ переносу рядка, якщо він є
            jsonContent = jsonContent.trim();
            if (jsonContent.endsWith("\n")) {
                jsonContent = jsonContent.substring(0, jsonContent.length() - 1);
            }

            // Розбиваємо вміст на рядки
            String[] components = jsonContent.split("\n");

            // Додаємо кожен компонент до списку
            for (String component : components) {
                history.add(component);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return history;
    }

}
