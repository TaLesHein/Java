package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MathsCalc {

    @FXML
    private Label absTxt;

    @FXML
    private Label powTxt;

    @FXML
    private Label sqrtTxt;

    @FXML
    private Label cbrtTxt;

    @FXML
    private Button btncCalc;

    @FXML
    private TextField txtField;

    @FXML
    private AnchorPane secondAnchor;

    @FXML
    public void initialize() {
        secondAnchor.setVisible(false);
    }

    @FXML
    void BtncCalcClick(ActionEvent event) {

        int value = Integer.parseInt(txtField.getText());

        secondAnchor.setVisible(true);

        int absValue = Math.abs(value);
        absTxt.setText(Integer.toString(absValue));

        int powValue = (int) Math.pow(value, 2);
        powTxt.setText(Integer.toString(powValue));

        double sqrtValue = Math.sqrt(value);
        sqrtTxt.setText(String.format("%.2f", sqrtValue));

        double cbrtValue = Math.cbrt(value);
        cbrtTxt.setText(String.format("%.2f", cbrtValue));
    }

}
