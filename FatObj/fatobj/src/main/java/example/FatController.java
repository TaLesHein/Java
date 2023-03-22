package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class FatController {

    @FXML
    private Button btn;

    @FXML
    private Label lblForm;

    @FXML
    private Label lblVal;

    @FXML
    private Spinner<Integer> spin;

    @FXML
    void initialize() {

        // Definindo o valor do spinner (min, max e ini)
        SpinnerValueFactory<Integer> spinValue = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5);
        spinValue.setValue(1);

        spin.setValueFactory(spinValue);

    }

    @FXML
    void btnClick(ActionEvent event) {
        Fatorial f = new Fatorial();
        int num = spin.getValue();

        f.setValor(num);
        lblVal.setText(Integer.toString(f.getFatorial()));
        lblForm.setText(f.getFormula());
    }

}
