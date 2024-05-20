package com.example.kurs_bets;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import Classu.Calculator;
import Classu.JsonHandler;
import Classu.Search;
import com.google.gson.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Osnova {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BUt1;

    @FXML
    private ImageView Foto;

    @FXML
    private Label Lab1;

    @FXML
    private Label Lab2;

    @FXML
    private Label Lab3;

    @FXML
    private TextField Tex1;

    @FXML
    private TextField Tex2;

    @FXML
    private Label Lab4;

    @FXML
    private Label Lab5;

    @FXML
    private Label Lab6;

    @FXML
    private TextField Tex3;

    @FXML
    private TextField Tex4;

    @FXML
    private Button BUt2;

    @FXML
    private ComboBox<String> Com1;

    @FXML
    private ComboBox<String> Com2;

    @FXML
    private Label Lab7;

    @FXML
    private TextField Tex5;

    @FXML
    private ProgressBar Prog;

    @FXML
    private Button BUt4;

    @FXML
    private Button BUt3;

    private Calculator calculator;
    private JsonHandler jsonHandler;


    @FXML
    void initialize() {

        // Ініціалізуємо об'єкт класу Calculator
        calculator = new Calculator();
        jsonHandler = new JsonHandler();

        // Отримання шляху до зображення в ресурсах
        String imagePath = "/com/example/kurs_bets/Placa Banheiro - Masculino + Feminino.jpg";

        // Створення об'єкта Image з файлу
        Image image = new Image(getClass().getResourceAsStream(imagePath));

        // Встановлення зображення в ImageView
        Foto.setImage(image);

        // Додавання елементів у ComboBox
        Com1.getItems().addAll("нема захворювань", "інфаркт міокарда", "гіпертонія", "цукровий діабет 2 типу", "бронхіальна астма", "рак легень", "таласемія", "фенілкетонурія", "мусковісцидоз", "хвороба Тея-Сакса", "хвороба Гоше", "хвороба Марфана", "синдром Дауна", "гемофілія", "полікістоз нирок");
        Com2.getItems().addAll("нема захворювань", "інфаркт міокарда", "гіпертонія", "цукровий діабет 2 типу", "бронхіальна астма", "рак легень", "таласемія", "фенілкетонурія", "мусковісцидоз", "хвороба Тея-Сакса", "хвороба Гоше", "хвороба Марфана", "синдром Дауна", "гемофілія", "полікістоз нирок");

        // Додаємо обмеження на TextField
        addTextLimiter(Tex1);
        addTextLimiter(Tex2);
        addTextLimiter(Tex3);
        addTextLimiter(Tex4);
        addTextLimiter(Tex5);

        BUt3.setOnAction(actionEvent -> {
            Stage stage = (Stage) BUt3.getScene().getWindow();//отримання контексту
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

        BUt1.setOnAction(actionEvent -> {

            String com1Selection = Com1.getValue();
            String com2Selection = Com2.getValue();

            // Перевірка, чи обрані значення в обох комбо-боксах
            if (com1Selection == null || com2Selection == null) {
                // Якщо один з комбо-боксів не обрано, вивести повідомлення про помилку
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Помилка");
                alert.setHeaderText(null);
                alert.setContentText("Будь ласка, оберіть захворювання у батьків.");
                alert.showAndWait();
                return;
            }

            // Перевірка, чи заповнені текстові поля
            if (Tex1.getText().isEmpty() || Tex2.getText().isEmpty() || Tex3.getText().isEmpty() || Tex4.getText().isEmpty()) {
                // Якщо одне з текстових полів не заповнено, вивести повідомлення про помилку
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Помилка");
                alert.setHeaderText(null);
                alert.setContentText("Будь ласка, заповніть всі текстові поля.");
                alert.showAndWait();
                return;
            }

            // Обчислення результатів за допомогою об'єкта Calculator
            calculator.calculateResults(com1Selection, com2Selection);

            // Отримання результатів з об'єкта Calculator
            String result1 = calculator.getResult1();
            String result2 = calculator.getResult2();
            String result3 = calculator.getResult3();
            String result4 = calculator.getResult4();
            String result5 = calculator.getResult5();
            String result6 = calculator.getResult6();
            String result7 = calculator.getResult7();
            String result8 = calculator.getResult8();
            String result9 = calculator.getResult9();
            String result10 = calculator.getResult10();
            String result11 = calculator.getResult11();
            String result12 = calculator.getResult12();
            String result13 = calculator.getResult13();
            String result14 = calculator.getResult14();
            String result15 = calculator.getResult15();

            // Добавляем компонент в файл
            jsonHandler.addToHistory();

            // Отримуємо дані з текстових полів і комбо-боксів
            String[] textFieldsData = {Tex1.getText(), Tex2.getText(), Tex3.getText(), Tex4.getText()};
            String comboBox1Data = Com1.getValue();
            String comboBox2Data = Com2.getValue();

            // Зберігаємо дані у форматі JSON
            JsonHandler.saveDataToJson(textFieldsData, comboBox1Data, comboBox2Data);

            Stage stage = (Stage) BUt1.getScene().getWindow();//отримання контексту
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

        BUt2.setOnAction(actionEvent -> {
            Stage stage = (Stage) BUt2.getScene().getWindow();//отримання контексту
            stage.close();// закриття поточної форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Information2-view.fxml"));
            //Блок створення адаптеру компонентів для нової форми
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Створення об'єкту класа вікна на яке будемо переходити
            Information2 information2 = (Information2) fxmlLoader.getController();

            stage = new Stage();//створення об'єкту формування вікна
            stage.setTitle("Вікно спадкових захворювань");// метод призначення заголовка
            stage.setResizable(false);
            stage.setScene(new Scene(root));//передача адаптера компонентів
            stage.show();//візуалізація вікна
            return;

        });

        BUt4.setOnAction(actionEvent -> {
            String userInput = Tex5.getText(); // Отримуємо текст из TextField
            Search search = new Search(Com1, Com2, Tex5, Prog);
            search.search(userInput);
        });
    }


    // Метод для завантаження даних з data.json
    void loadDataFromJson(int selectedIndex) {
        try {
            // Читаємо вміст файлу data.json в рядок
            String jsonContent = Files.readString(Paths.get("src/main/resources/com/example/kurs_bets/data.json"));
            // Створюємо об'єкт Gson для роботи з JSON
            Gson gson = new Gson();
            // Розбираємо вміст data.json в масив елементів JsonElement
            JsonElement jsonElement = JsonParser.parseString(jsonContent);
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            // Оюираємо потрібний елемент масиву по індексу
            JsonObject selectedObject = jsonArray.get(selectedIndex).getAsJsonObject();
            // Отримуємо дані з обраного елемента
            JsonArray textFieldsDataArray = selectedObject.getAsJsonArray("textFieldsData");
            String comboBox1Data = selectedObject.get("comboBox1Data").getAsString();
            String comboBox2Data = selectedObject.get("comboBox2Data").getAsString();

            // Заповнюємо поля textField даними з обраного масиву
            Tex1.setText(textFieldsDataArray.get(0).getAsString());
            Tex2.setText(textFieldsDataArray.get(1).getAsString());
            Tex3.setText(textFieldsDataArray.get(2).getAsString());
            Tex4.setText(textFieldsDataArray.get(3).getAsString());
            // Заповнюємо ComboBox даними з обраного масиву
            Com1.setValue(comboBox1Data);
            Com2.setValue(comboBox2Data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void addTextLimiter(TextField textField) {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 20) {
                textField.setText(oldValue);
            } else if (!newValue.matches("[a-zA-Zа-яА-ЯёЁіїІЇєЄ]*")) {
                textField.setText(oldValue);
            }
        });

    }
}


