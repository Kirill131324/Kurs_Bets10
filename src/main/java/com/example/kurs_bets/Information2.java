package com.example.kurs_bets;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Information2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea BigTex2;

    @FXML
    private Button Bbut1;

    @FXML
    void initialize() {
        Bbut1.setOnAction(actionEvent -> {
            Stage stage = (Stage) Bbut1.getScene().getWindow();//отримання контексту
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
    }
}
