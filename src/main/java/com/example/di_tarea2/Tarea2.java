package com.example.di_tarea2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Tarea2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tarea Desarrollo Interfaces");

        // Cargar el nuevo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tarea2.fxml"));
        Parent root = loader.load();

        // Configurar el controlador si es necesario
        //TuController controller = loader.getController();
        //controller.setPrimaryStage(primaryStage); // Puedes agregar un método para establecer la referencia a primaryStage en TuController si es necesario

        Scene scene = new Scene(root);

        // Cargar el archivo de estilo CSS solo para la escena principal
        scene.getStylesheets().add(getClass().getResource("estiloportada.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        // Centra la ventana en la pantalla
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    // Método para abrir el archivo FXML
    /*private void abrirProcesadorFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("procesador2.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Procesador");
            stage.setScene(new Scene(root, 800, 600));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar la excepción, por ejemplo, mostrar un mensaje de error
        }
    }*/

    public static void main(String[] args) {
        launch(args);
    }
}
