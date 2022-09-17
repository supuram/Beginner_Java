module com.example.java_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_fx to javafx.fxml;
    exports com.example.java_fx;
}