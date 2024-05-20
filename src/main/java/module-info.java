module com.example.kurs_bets {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.ooxml;
    requires com.google.gson;


    opens com.example.kurs_bets to javafx.fxml;
    exports com.example.kurs_bets;
    exports Classu;
    opens Classu to javafx.fxml;
}