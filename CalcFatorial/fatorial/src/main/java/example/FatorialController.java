package example;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class FatorialController {

    @FXML
    private Spinner<Integer> spin;

    @FXML
    private Label lblFat;

    @FXML
    void initialize() {

        SpinnerValueFactory<Integer> spinValue = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 5);
        spinValue.setValue(0);
        spin.setValueFactory(spinValue);

        spin.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {

                if (spin.getValue() == 0){
                    lblFat.setText(Integer.toString(0));
                    return;
                }
                int n = spin.getValue();
                int c = n;
                int f = 1;

                while (c >= 1) {
                    f *= c;
                    c--;
                }

                lblFat.setText(Integer.toString(f));

            }

        });

    }

    void Fatoral() {

    }

}
