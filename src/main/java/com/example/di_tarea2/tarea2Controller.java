package com.example.di_tarea2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class tarea2Controller {
    private Stage primaryStage;

    @FXML
    private void abrirProcesadorFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("procesador2.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Procesador");
            stage.setScene(new Scene(root, 1200, 900));
            stage.getScene().getStylesheets().add(getClass().getResource("estiloprocesador.css").toExternalForm());
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public void abrirhojacalculoFXML(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hojacalculo.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Hoja de Calculo");
            stage.setScene(new Scene(root, 1200, 900));
            stage.getScene().getStylesheets().add(getClass().getResource("estilohojacalculo.css").toExternalForm());
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar la excepción, por ejemplo, mostrar un mensaje de error
        }
    }
    public void abrirCalculadoraFXML(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("calculadora.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Calculadora Cientifica");
            stage.setScene(new Scene(root, 600, 300));
            stage.getScene().getStylesheets().add(getClass().getResource("estilocalculadora.css").toExternalForm());
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
