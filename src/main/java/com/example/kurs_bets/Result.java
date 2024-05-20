package com.example.kurs_bets;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import Classu.Document;
import Classu.Document1;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Result {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> Spisok;

    @FXML
    private ImageView FotoC;

    @FXML
    private Button BUT2;

    @FXML
    private Button BUT3;

    @FXML
    private Button BUT1;

        public void setNewString(String result1, String result2, String result3, String result4, String result5, String result6, String result7, String result8, String result9, String result10, String result11, String result12, String result13, String result14, String result15) {
            // Очистити список
            Spisok.getItems().clear();
            // Додати нові елементи
            Spisok.getItems().addAll(result1, result2, result3, result4, result5, result6, result7, result8, result9, result10, result11, result12, result13, result14, result15);
        }


    @FXML
    void initialize() {
        // Отримання шляху до зображення в ресурсах
        String imagePath = "/com/example/kurs_bets/Child.jpg";

        // Створення об'єкта Image з файлу
        Image image = new Image(getClass().getResourceAsStream(imagePath));

        // Встановлення зображення в ImageView
        FotoC.setImage(image);

        BUT1.setOnAction(actionEvent -> {
            int someValue = readSomeFromJson();
            if (someValue == 0) {
                Stage stage = (Stage) BUT1.getScene().getWindow();//отримання контексту
                stage.close();// закриття поточної форми
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("osnova-view.fxml"));
                //Блок створення адаптеру компонентів для нової форми
                Parent root = null;
                try {
                    root = (Parent) fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                writeSomeToJson(0);

                //Створення об'єкту класа вікна на яке будемо переходити
                Osnova osnova = (Osnova) fxmlLoader.getController();

                stage = new Stage();//створення об'єкту формування вікна
                stage.setTitle("Основне вікно");// метод призначення заголовка
                stage.setResizable(false);
                stage.setScene(new Scene(root));//передача адаптера компонентів
                stage.show();//візуалізація вікна
                return;
            } else {
                Stage stage = (Stage) BUT1.getScene().getWindow();//отримання контексту
                stage.close();// закриття поточної форми
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("History-view.fxml"));
                //Блок створення адаптеру компонентів для нової форми
                Parent root = null;
                try {
                    root = (Parent) fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                writeSomeToJson(0);

                //Створення об'єкту класа вікна на яке будемо переходити
                History history = (History) fxmlLoader.getController();

                stage = new Stage();//створення об'єкту формування вікна
                stage.setTitle("Вікно попередніх запитів");// метод призначення заголовка
                stage.setResizable(false);
                stage.setScene(new Scene(root));//передача адаптера компонентів
                stage.show();//візуалізація вікна
                return;
            }

        });

        BUT2.setOnAction(actionEvent -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Зберегти документ Word");

            // Встановлення фільтра для вибору тільки файлів із розширенням .doc
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Word files (*.doc)", "*.doc");
            fileChooser.getExtensionFilters().add(extFilter);

            // Показуємо діалог збереження файлу й отримуємо обраний шлях
            File file = fileChooser.showSaveDialog((Stage) BUT2.getScene().getWindow());

            // Якщо файл обрано, то зберігаємо дані в нього
            if (file != null) {
                Document.saveToWord(Spisok.getItems(), file.getAbsolutePath());
            }
        });

        BUT3.setOnAction(actionEvent -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Зберегти документ Word");

            // Встановлення фільтра для вибору тільки файлів із розширенням .doc
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Word files (*.doc)", "*.doc");
            fileChooser.getExtensionFilters().add(extFilter);

            // Показуємо діалог збереження файлу й отримуємо обраний шлях
            File file = fileChooser.showSaveDialog((Stage) BUT3.getScene().getWindow());

            // Якщо файл обрано, то зберігаємо дані в нього
            if (file != null) {
                Document1.saveToWord(Spisok.getItems(), file.getAbsolutePath());
            }
        });


    }

    private int readSomeFromJson() {
        try {
            Path filePath = Paths.get("src/main/resources/com/example/kurs_bets/some.json");
            if (!Files.exists(filePath)) {
                // Якщо файл не існує, створюємо його з дефолтним значенням 0
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("some", 0);
                Files.writeString(filePath, jsonObject.toString());
                return 0;
            }

            // Читаємо вміст файлу
            String jsonContent = Files.readString(filePath);
            JsonObject jsonObject = JsonParser.parseString(jsonContent).getAsJsonObject();
            return jsonObject.get("some").getAsInt();
        } catch (IOException e) {
            e.printStackTrace();
            return 0; // Значення за замовчуванням
        }
    }

    private void writeSomeToJson(int someValue) {
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("some", someValue);
            Files.writeString(Paths.get("src/main/resources/com/example/kurs_bets/some.json"), jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
