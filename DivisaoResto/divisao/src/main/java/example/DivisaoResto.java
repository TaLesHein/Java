package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DivisaoResto {
    @FXML
    private Button btnCalc;

    @FXML
    private Label lblDiv;

    @FXML
    private Label lblResto;

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    void btnClick(ActionEvent event) {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int divisao = n1 / n2;
        int resto = n1 % n2;
        lblDiv.setText(Integer.toString(divisao));
        lblResto.setText(Integer.toString(resto));
    }
}
