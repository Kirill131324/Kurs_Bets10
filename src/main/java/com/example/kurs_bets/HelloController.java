package com.example.kurs_bets;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import Classu.ZagruzkaOs;
import com.google.gson.JsonObject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Zastavka;

    @FXML
    private Button But1;

    @FXML
    private Button But2;

    @FXML
    private Button But3;

    @FXML
    private Button But4;

    @FXML
    private Label L1;

    private static boolean isLoaded = false;

    static {
        if (!isLoaded) {
            // Викликаємо метод завантаження з класу ZagruzkaOs
            ZagruzkaOs loader = new ZagruzkaOs();
            loader.loading();
            isLoaded = true;
        }
    }

    @FXML
    void initialize() {
        writeSomeToJson(0);

        // Отримання шляху до зображення в ресурсах
        String imagePath = "/com/example/kurs_bets/PaxlovidCovidGetty.jpg";

        // Створення об'єкта Image з файлу
        Image image = new Image(getClass().getResourceAsStream(imagePath));

        // Встановлення зображення в ImageView
        Zastavka.setImage(image);

        But1.setOnAction(actionEvent -> {
            Stage stage = (Stage) But1.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("osnova-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Створення об'єкту класа вікна на яке будемо переходити
            Osnova osnova = (Osnova) fxmlLoader.getController();

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Основне вікно");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });

        But3.setOnAction(actionEvent -> {
            Stage stage = (Stage) But3.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Information1-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Створення об'єкту класа вікна на яке будемо переходити
            Information1 information1 = (Information1) fxmlLoader.getController();

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Вікно інформації");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });

        But2.setOnAction(actionEvent -> {
            Stage stage = (Stage) But2.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("History-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Створення об'єкту класа вікна на яке будемо переходити
            History history = (History) fxmlLoader.getController();

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Вікно попередніх запитів");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });

        But4.setOnAction(actionEvent -> {
            Stage stage = (Stage) But4.getScene().getWindow();
            writeSomeToJson(0);
            stage.close(); //Закритя програми
        });

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
