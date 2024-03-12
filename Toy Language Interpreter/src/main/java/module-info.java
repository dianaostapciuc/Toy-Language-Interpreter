module com.example.a7test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.a7test to javafx.fxml;
    exports com.example.a7test;
}