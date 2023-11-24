module com.example.di_tarea2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.di_tarea2 to javafx.fxml;
    exports com.example.di_tarea2;
}