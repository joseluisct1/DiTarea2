package com.example.di_tarea2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Tarea2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Establecer el título de la ventana
        primaryStage.setTitle("");

        // Cargar el nuevo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tarea2.fxml"));
        Parent root = loader.load();

        /* Crear una escena con un tamaño inicial de 500x500 */
        Scene scene = new Scene(root, 500, 500);

        // Cargar el archivo de estilo CSS solo para la escena principal
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("estiloportada.css")).toExternalForm());

        // Deshabilitar la capacidad de redimensionar la ventana
        primaryStage.setResizable(false);

        // Establecer la escena en la ventana principal
        primaryStage.setScene(scene);

        // Centrar la ventana en la pantalla
        primaryStage.centerOnScreen();

        // Mostrar la ventana
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
