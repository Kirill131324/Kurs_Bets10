package com.example.kurs_bets;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;

import Classu.Calculator2;
import com.google.gson.*;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class History {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Bbut2;

    @FXML
    private ListView<String> Spisok1;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L7;

    @FXML
    private Label L5;

    @FXML
    private Label L6;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Button Bbut1;

    @FXML
    private Button Bbut3;

    @FXML
    private TextField Teex1;

    @FXML
    private TextField Teex2;

    @FXML
    private TextField Teex3;

    @FXML
    private TextField Teex4;

    @FXML
    private TextField Teex5;

    @FXML
    private TextField Teex6;

    // Додаємо властивість для відстеження вибору елемента в Spisok1
    private BooleanProperty isItemSelected1 = new SimpleBooleanProperty(false);
    private BooleanProperty isItemSelected2 = new SimpleBooleanProperty(false);

    private Calculator2 calculator2;

    private int selectedIndex; // Додаємо змінну для збереження вибраного індексу


    @FXML
    void initialize() {
        calculator2 = new Calculator2();
        // Прив'язуємо властивість disable кнопки Bbut1 до isItemSelected1 і Bbut3 до isItemSelected2
        Bbut1.disableProperty().bind(isItemSelected1.not());
        Bbut3.disableProperty().bind(isItemSelected2.not());

        loadComponentsFromFile();
        Spisok1.setOnMouseClicked(event -> {
            // Отримуємо обраний елемент зі списку
            String selectedComponent = Spisok1.getSelectionModel().getSelectedItem();
            if (selectedComponent != null) {
                // Отримуємо індекс обраного елемента в списку
                int selectedIndex = Spisok1.getSelectionModel().getSelectedIndex();
                // Завантажуємо дані з data.json
                loadDataFromJson(selectedIndex);
                // Встановлюємо прапор, що елемент обрано
                isItemSelected1.set(true);
                isItemSelected2.set(true);
            }
        });

        Bbut2.setOnAction(actionEvent -> {
            Stage stage = (Stage) Bbut2.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
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

        Bbut1.setOnAction(actionEvent -> {

            String com1Selection = Teex5.getText();
            String com2Selection = Teex6.getText();

            // Обчислення результатів за допомогою об'єкта Calculator
            calculator2.calculateResults(com1Selection, com2Selection);

            // Отримання результатів з об'єкта Calculator
            String result1 = calculator2.getResult1();
            String result2 = calculator2.getResult2();
            String result3 = calculator2.getResult3();
            String result4 = calculator2.getResult4();
            String result5 = calculator2.getResult5();
            String result6 = calculator2.getResult6();
            String result7 = calculator2.getResult7();
            String result8 = calculator2.getResult8();
            String result9 = calculator2.getResult9();
            String result10 = calculator2.getResult10();
            String result11 = calculator2.getResult11();
            String result12 = calculator2.getResult12();
            String result13 = calculator2.getResult13();
            String result14 = calculator2.getResult14();
            String result15 = calculator2.getResult15();

            writeSomeToJson(1);

            Stage stage = (Stage) Bbut1.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Result-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Створення об'єкту класа вікна на яке будемо переходити
            Result result = (Result) fxmlLoader.getController();
            result.setNewString(result1, result2, result3, result4, result5, result6, result7, result8, result9, result10, result11, result12, result13, result14, result15);

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Вікно результатів");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });

        Bbut3.setOnAction(actionEvent -> {
            Stage stage = (Stage) Bbut3.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("osnova-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Отримуємо індекс вибраного елемента зі списку Spisok1
            int selectedIndex = Spisok1.getSelectionModel().getSelectedIndex();
            //Створення об'єкту класа вікна на яке будемо переходити
            Osnova osnova = (Osnova) fxmlLoader.getController();
            // Передаємо логічну змінну та індекс в метод loadDataFromJson
            osnova.loadDataFromJson(selectedIndex);

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Основне вікно");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });
    }

    // Метод для завантаження даних з data.json
    private void loadDataFromJson(int index) {
        try {
            // Читаємо вміст data.json у рядок
            String jsonContent = Files.readString(Paths.get("src/main/resources/com/example/kurs_bets/data.json"));
            // Створюємо об'єкт Gson для роботи з JSON
            Gson gson = new Gson();
            // Розбираємо вміст data.json у масив об'єктів JsonElement
            JsonElement jsonElement = JsonParser.parseString(jsonContent);
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            // Отримуємо обраний масив за індексом
            JsonObject selectedObject = jsonArray.get(index).getAsJsonObject();
            // Отримуємо дані з обраного масиву
            JsonArray textFieldsDataArray = selectedObject.getAsJsonArray("textFieldsData");
            String comboBox1Data = selectedObject.get("comboBox1Data").getAsString();
            String comboBox2Data = selectedObject.get("comboBox2Data").getAsString();
            // Заповнюємо поля textField даними з обраного масиву
            Teex1.setText(textFieldsDataArray.get(0).getAsString());
            Teex2.setText(textFieldsDataArray.get(1).getAsString());
            Teex3.setText(textFieldsDataArray.get(2).getAsString());
            Teex4.setText(textFieldsDataArray.get(3).getAsString());
            Teex5.setText(comboBox1Data);
            Teex6.setText(comboBox2Data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для завантаження компонентів із файлу history.json
    private void loadComponentsFromFile() {
        try {
            // Шлях до файлу history.json
            String filePath = "src/main/resources/com/example/kurs_bets/history.json";

            // Перевіряємо, чи існує файл
            if (Files.exists(Paths.get(filePath))) {
                // Читаємо вміст файлу
                List<String> lines = Files.readAllLines(Paths.get(filePath));

                // Додаємо кожен рядок до списку Spisok1
                ObservableList<String> items = FXCollections.observableArrayList(lines);
                Spisok1.setItems(items);
            }
        } catch (IOException e) {
            e.printStackTrace();
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
