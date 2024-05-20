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

public class Information1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea BigTex1;

    @FXML
    private Button Bbut;

    @FXML
    void initialize() {
        Bbut.setOnAction(actionEvent -> {
            Stage stage = (Stage) Bbut.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Створення об'єкту класа вікна на яке будемо переходити
            HelloController helloController = (HelloController) fxmlLoader.getController();

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Головне вікно");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });
    }
}
