package com.example.di_tarea2;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Procesador2Controller {

    @FXML
    private Button closeButton; // Asegúrate de importar la clase Button de javafx.scene.control
    @FXML
    private ImageView toolBuscar;
    @FXML
    private ComboBox<String> zoom;
    @FXML
    private ComboBox<String> tipotexto;
    @FXML
    private void cerrarVentana() {
        // Obtén la referencia de la escena y cierra la ventana
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
    public void initialize() {

        Tooltip tooltipBuscar = new Tooltip("Buscar");
        Tooltip.install(toolBuscar, tooltipBuscar);
        // inicializo el combobox a 100%
        zoom.setValue("100%");
        tipotexto.setValue("Texto Normal");
    }
}