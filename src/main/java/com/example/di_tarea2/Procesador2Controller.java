package com.example.di_tarea2;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Procesador2Controller {
    public VBox procesadorBox;
    public Button cmdset;
    public Button cmdaccesi;
    public Button cmdusuario;
    public ImageView imguser;
    public ToolBar toolbarCabecera;
    public Button cmdcompartir4;
    public Button cmdcompartir11;
    public TextArea miTextArea;
    public Button cmdcompartir3;
    public Button cmdcompartir111;
    public Button cmdundo;
    public ImageView cmdColorTexto1;
    public Button cmdcompartir41;
    public Button cmdcompartir211;
    public ImageView cmdColorTexto11;
    public Button cmdcompartir31;
    public Button cmdcompartir;
    public Button cmdcompartir1;
    public Button cmdcompartir2;
    public ImageView cmdColorTexto;
    // Asegúrate de importar la clase Button de javafx.scene.control
    @FXML
    private ComboBox<String> zoom;
    @FXML
    private ComboBox<String> tipotexto;
    @FXML
    private ComboBox<String> tipoletra;
    @FXML

    public void initialize() {
        // Obtén la lista de tipos de letra disponibles
        String[] fontFamilies = Font.getFamilies().toArray(new String[0]);
        // Llena el ComboBox con la lista de tipos de letra
        tipoletra.setItems(FXCollections.observableArrayList(fontFamilies));
        // inicializo el combobox a 100%
        zoom.setValue("100%");
        tipotexto.setValue("Texto Normal");
        tipoletra.setValue("Arial");
    }
}
