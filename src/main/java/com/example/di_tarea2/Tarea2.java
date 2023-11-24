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


        Scene scene = new Scene(root);

        // Cargar el archivo de estilo CSS solo para la escena principal
        scene.getStylesheets().add(getClass().getResource("estiloportada.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        // Centra la ventana en la pantalla
        primaryStage.centerOnScreen();
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
