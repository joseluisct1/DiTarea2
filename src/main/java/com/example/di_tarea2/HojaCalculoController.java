package com.example.di_tarea2;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Font;

public class HojaCalculoController {

    @FXML
    private ComboBox<String> zoom;
    @FXML
    private ComboBox<String> tipotexto;
    @FXML
    private ComboBox<String> tipoletra;
    @FXML
    private TableView<ObservableList<String>> tableView;

    public void initialize() {
        // Obtén la lista de tipos de letra disponibles
        String[] fontFamilies = Font.getFamilies().toArray(new String[0]);
        // Llena el ComboBox con la lista de tipos de letra
        tipoletra.setItems(FXCollections.observableArrayList(fontFamilies));
        // Inicializa el combobox a 100%
        zoom.setValue("100%");
        tipotexto.setValue("Texto Normal");
        tipoletra.setValue("Arial");

        // Configurar columnas para la TableView
        for (int i = 0; i < 26; i++) {
            char columnName = (char) ('A' + i);
            TableColumn<ObservableList<String>, String> column = new TableColumn<>(String.valueOf(columnName));
            final int columnIndex = i;

            column.setCellValueFactory(data -> {
                ObservableList<String> row = data.getValue();
                return new SimpleStringProperty(row.get(columnIndex));
            });

            column.setCellFactory(TextFieldTableCell.forTableColumn());

            column.setOnEditCommit(event -> {
                ObservableList<String> row = event.getTableView().getItems().get(event.getTablePosition().getRow());
                row.set(columnIndex, event.getNewValue());
            });

            column.setPrefWidth(100);
            tableView.getColumns().add(column);
        }

        ObservableList<ObservableList<String>> data = FXCollections.observableArrayList();
        for (int i = 0; i < 100; i++) {
            ObservableList<String> row = FXCollections.observableArrayList();
            for (int j = 0; j < 26; j++) {
                row.add("");
            }
            data.add(row);
        }

        // Establecer los datos en la TableView
        tableView.setItems(data);
    }
}

