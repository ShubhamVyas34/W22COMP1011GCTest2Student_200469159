module com.example.w22comp1011gctest2student {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.w22comp1011gctest2student to javafx.fxml;
    exports com.example.w22comp1011gctest2student;
}