package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;

public class DeltaController {

    @FXML
    private Button btnCalc;

    @FXML
    private AnchorPane infoDelType;

    @FXML
    private Label lblA;

    @FXML
    private Label lblB;

    @FXML
    private Label lblC;

    @FXML
    private Label lblDelValue;

    @FXML
    private Label lbllRoot;

    @FXML
    private Spinner<Integer> spinA;

    @FXML
    private Spinner<Integer> spinB;

    @FXML
    private Spinner<Integer> spinC;

    int delta;

    @FXML
    void initialize() {
        // Escondendo valor de delta
        infoDelType.setVisible(false);

        // Definindo máx e min de cada spinner
        SpinnerValueFactory<Integer> spin1Value = new SpinnerValueFactory.IntegerSpinnerValueFactory(-9, 9);
        spin1Value.setValue(0);

        SpinnerValueFactory<Integer> spin2Value = new SpinnerValueFactory.IntegerSpinnerValueFactory(-9, 9);
        spin2Value.setValue(0);

        SpinnerValueFactory<Integer> spin3Value = new SpinnerValueFactory.IntegerSpinnerValueFactory(-9, 9);
        spin3Value.setValue(0);

        // Definir cada spinner com seu devido valor
        spinA.setValueFactory(spin1Value);
        spinB.setValueFactory(spin2Value);
        spinC.setValueFactory(spin3Value);
    }

    @FXML
    void BtncCalcClick(ActionEvent event) {
        // Mostrando o valor de delta
        infoDelType.setVisible(true);

        // Passando os valores dos spinner para variáveis inteiras
        int a = spinA.getValue();
        int b = spinB.getValue();
        int c = spinC.getValue();

        // Fazendo a conta
        delta = (int) (Math.pow(b, 2) - (4 * a * c));

        // Definindo textos do delta e do tipo
        lblDelValue.setText(Integer.toString(delta));

        if (delta >= 0) {
            lbllRoot.setText("Existem raízes reais");
        } else {
            lbllRoot.setText("Não existe raízes reais");
        }
    }

    @FXML
    void txtAChange(InputMethodEvent event) {
        lblA.setText(spinA.getValue().toString());
    }

    @FXML
    void txtBChange(InputMethodEvent event) {

    }

    @FXML
    void txtCChange(InputMethodEvent event) {

    }

}
