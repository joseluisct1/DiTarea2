package com.example.di_tarea2;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calculadoraController {

    @FXML
    private TextField display;

    private String currentInput = "";
    private String currentOperator = "";
    private double currentResult = 0;

    @FXML
    private void onDigitButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        currentInput += clickedButton.getText();
        updateDisplay();
    }

    @FXML
    private void onOperatorButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        currentOperator = clickedButton.getText();
        currentResult = Double.parseDouble(currentInput);
        currentInput = "";
    }

    @FXML
    private void onEqualButtonClick() {
        if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
            double secondOperand = Double.parseDouble(currentInput);
            switch (currentOperator) {
                case "+":
                    currentResult += secondOperand;
                    break;
                case "-":
                    currentResult -= secondOperand;
                    break;
                case "*":
                    currentResult *= secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        currentResult /= secondOperand;
                    } else {
                        // Manejar la división por cero
                        currentResult = 0;
                    }
                    break;
            }
            currentInput = String.valueOf(currentResult);
            currentOperator = "";
            updateDisplay();
        }
    }

    @FXML
    private void onDecimalButtonClick() {
        if (!currentInput.contains(".")) {
            currentInput += ".";
            updateDisplay();
        }
    }

    private void updateDisplay() {
        display.setText(currentInput);
    }
}

