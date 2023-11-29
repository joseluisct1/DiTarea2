package com.example.di_tarea2;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableRow;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HojaCalculoController {

    @FXML
    private Button closeButton;
    @FXML
    private ImageView toolBuscar;
    @FXML
    private ImageView imgidioma;
    @FXML
    private ComboBox<String> zoom;
    @FXML
    private ComboBox<String> tipotexto;
    @FXML
    private ComboBox<String> tipoletra;
    @FXML
    private TableView<String[]> tableView;

    @FXML
    private void cerrarVentana() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void initialize() {
        // Crear y configurar las columnas con nombres en orden alfabético
        for (int i = 0; i < 26; i++) {
            char columnName = (char) ('A' + i);
            TableColumn<String[], String> column = new TableColumn<>(String.valueOf(columnName));
            setCellStyle(column);
            tableView.getColumns().add(column);
        }

        // Configurar estilos de celda y agregar datos de ejemplo
        tableView.getItems().clear();
        for (int row = 1; row <= 10; row++) {
            String[] rowData = new String[26];
            for (int col = 0; col < 26; col++) {
                rowData[col] = String.valueOf(row) + (char) ('A' + col);
            }
            tableView.getItems().add(rowData);
        }

        // Establecer el estilo de las celdas con números de fila y nombres de columna en verde
        setGreenCellStyle();

        // Obtener la lista de tipos de letra disponibles
        String[] fontFamilies = Font.getFamilies().toArray(new String[0]);

        // Llenar el ComboBox con la lista de tipos de letra
        tipoletra.setItems(FXCollections.observableArrayList(fontFamilies));
        Tooltip tooltipBuscar = new Tooltip("Buscar");
        Tooltip.install(toolBuscar, tooltipBuscar);
        Tooltip tooltipidioma = new Tooltip("Idioma");
        Tooltip.install(imgidioma, tooltipidioma);
        // Inicializar el combobox a 100%
        zoom.setValue("100%");
        tipotexto.setValue("Texto Normal");
    }

    private void setCellStyle(TableColumn<String[], String> column) {
        column.setCellFactory(cell -> new StyledTableCell<>());
    }

    private void setGreenCellStyle() {
        tableView.setRowFactory(tv -> new TableRow<>() {
            @Override
            protected void updateItem(String[] item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setStyle("");
                } else {
                    int rowIndex = getIndex();
                    if (rowIndex == 0) {
                        setStyle("-fx-background-color: #00FF00;");
                    } else {
                        setStyle("");
                    }
                }
            }
        });

        for (int i = 0; i < tableView.getColumns().size(); i++) {
            TableColumn<String[], String> column = (TableColumn<String[], String>) tableView.getColumns().get(i);
            int colIndex = i;

            column.setCellFactory(tc -> new TableCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);

                    if (empty || item == null) {
                        setText(null);
                        setStyle("");
                    } else {
                        int rowIndex = getIndex();
                        if (rowIndex == 0 || colIndex == 0) {
                            setStyle("-fx-background-color: #00FF00;");
                        } else {
                            setStyle("");
                        }
                        setText(item);
                    }
                }
            });
        }
    }

    private static class StyledTableCell<T> extends TableCell<String[], String> {
        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);

            if (item == null || empty) {
                setText(null);
                setStyle("");
            } else {
                setText(item);
                setStyle("-fx-border-color: black; -fx-border-width: 0.5px; -fx-padding: 5px;");
            }
        }
    }
}
