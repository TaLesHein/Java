package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Propriedades {
    @FXML
    private Button btnResult;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    void buttonAction(ActionEvent event) {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());

        int result = n1 + n2;

        lblResult.setText(Integer.toString(result));
    }
}
