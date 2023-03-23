module com.example.javafxx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxx to javafx.fxml;
    exports com.example.javafxx;
}