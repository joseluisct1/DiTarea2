package com.example.di_tarea2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class tarea2Controller {
    private Stage primaryStage;

    // Puedes agregar otros elementos necesarios

    @FXML
    private void abrirProcesadorFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("procesador2.fxml"));
            Parent root = loader.load();

            // Configurar el controlador si es necesario
            // ProcesadorController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Procesador");
            stage.setScene(new Scene(root, 800, 600));

            // Cargar el archivo de estilo CSS para la nueva ventana
            stage.getScene().getStylesheets().add(getClass().getResource("estiloportada.css").toExternalForm());

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar la excepción, por ejemplo, mostrar un mensaje de error
        }
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

}
