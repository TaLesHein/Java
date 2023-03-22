package com.example;

import java.util.Calendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AnoController {
    Calendar calendar = Calendar.getInstance();
    @FXML
    private Button btnCalc;

    @FXML
    private Label lblAge;

    @FXML
    private TextField txtYear;

    @FXML
    void btnCalcClick(ActionEvent event) {

        int yearBirth = Integer.parseInt(txtYear.getText());
        int year = calendar.get(Calendar.YEAR);
        int age = year - yearBirth;
        lblAge.setText(Integer.toString(age));
    }

}
