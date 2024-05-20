package Classu;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import java.util.Timer;
import java.util.TimerTask;

public class Search {
    private ComboBox<String> comboBox1;
    private ComboBox<String> comboBox2;
    private TextField textField;
    private ProgressBar progressBar;

    public Search(ComboBox<String> comboBox1, ComboBox<String> comboBox2, TextField textField, ProgressBar progressBar) {
        this.comboBox1 = comboBox1;
        this.comboBox2 = comboBox2;
        this.textField = textField;
        this.progressBar = progressBar;
    }

    public void search(String userInput) {
        double sourceLength = comboBox1.getItems().size() + comboBox2.getItems().size();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            double progress = 0;

            @Override
            public void run() {
                if (progress <= 1) {
                    Platform.runLater(() -> progressBar.setProgress(progress));
                    progress += 0.01;
                } else {
                    timer.cancel();
                    Platform.runLater(() -> {
                        progressBar.setProgress(0);
                        showDisease(userInput);
                    });
                }
            }
        }, 0, 50);
    }

    private void showDisease(String userInput) {
        // Отримуємо список елементів в комбобоксах
        boolean found = false;
        for (String item : comboBox1.getItems()) {
            // Якщо елемент містить введений користувачем текст, підсвічуємо його
            if (item.equalsIgnoreCase(userInput.trim())) {
                comboBox1.getSelectionModel().select(item);
                found = true;
            }
        }

        for (String item : comboBox2.getItems()) {
            // Якщо елемент містить введений користувачем текст, підсвічуємо його
            if (item.equalsIgnoreCase(userInput.trim())) {
                comboBox2.getSelectionModel().select(item);
                found = true;
            }
        }

        if (!found) {
            // Виводимо повідомлення про помилку, якщо хвороба не знайдена в комбобоксах
            Platform.runLater(() -> {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Помилка");
                alert.setHeaderText(null);
                alert.setContentText("Такого захворювання немає у списку.");
                alert.showAndWait();
            });
        }
    }

}
