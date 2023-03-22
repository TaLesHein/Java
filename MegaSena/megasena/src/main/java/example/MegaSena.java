package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

public class MegaSena {

    // JavaFx
    @FXML
    private Button btnRoll;

    @FXML
    private Label n1Txt;

    @FXML
    private Label n2Txt;

    @FXML
    private Label n3Txt;

    @FXML
    private Label n4Txt;

    @FXML
    private Label n5Txt;

    @FXML
    private Label n6Txt;

    // Variables
    Random random = new Random();
    ArrayList<Integer> numberList = new ArrayList<Integer>();

    int randomValue, index;
    String orange = "#FF9300";
    String blue = "#00F";
    String purple = "#EC54FF";

    @FXML
    void initialize() {

    }

    @FXML
    void BtncRollClick(ActionEvent event) {

        do {
            randomValue = 1 + random.nextInt(60);
        } while (ListVerification(randomValue) == false);

        index++;
        SwitchCase(randomValue);
        btncController();

    }

    @FXML
    void BtnMouseEnter(MouseEvent event) {
        if (index < 6) {
            btnRoll.setStyle("-fx-border-color: " + orange);
        } else {
            btnRoll.setStyle("-fx-border-color: " + purple);
        }
    }

    @FXML
    void BtnMouseExit(MouseEvent event) {
        if (index < 6) {
            btnRoll.setStyle("-fx-border-color: " + blue);
        } else {
            btnRoll.setStyle("-fx-border-color: " + purple);
        }
    }

    void btncController() {
        if (btnRoll.getText().equals("Novos Valores")) {
            btnRoll.setText("Roletar Valores");
            index = 0;
            ResetValues();
        } else if (index >= 6) {
            btnRoll.setText("Novos Valores");
            btnRoll.setStyle("-fx-border-color: " + purple);
        }

    }

    void SwitchCase(int randomValue) {
        switch (index) {
            case 1:
                n1Txt.setText(Integer.toString(randomValue));
                n1Txt.setStyle("; ");
                return;
            case 2:
                n2Txt.setText(Integer.toString(randomValue));
                n2Txt.setStyle("");
                return;
            case 3:
                n3Txt.setText(Integer.toString(randomValue));
                n3Txt.setStyle("");
                return;
            case 4:
                n4Txt.setText(Integer.toString(randomValue));
                n4Txt.setStyle("");
                return;
            case 5:
                n5Txt.setText(Integer.toString(randomValue));
                n5Txt.setStyle("");
                return;
            case 6:
                n6Txt.setText(Integer.toString(randomValue));
                n6Txt.setStyle("");
                return;
        }
    }

    boolean ListVerification(int number) {
        if (index == 0) {
            List(number);
            return true;
        }

        for (int i = 0; i != numberList.size(); i++) {
            if (number == numberList.get(i)) {
                return false;
            }
        }

        List(number);
        return true;
    }

    void List(int randomValue) {
        numberList.add(randomValue);

    }

    void ResetValues() {
        numberList.clear();
        n1Txt.setText("");
        n2Txt.setText("");
        n3Txt.setText("");
        n4Txt.setText("");
        n5Txt.setText("");
        n6Txt.setText("");

        n1Txt.setStyle("-fx-border-color: " + blue);
        n2Txt.setStyle("-fx-border-color: " + blue);
        n3Txt.setStyle("-fx-border-color: " + blue);
        n4Txt.setStyle("-fx-border-color: " + blue);
        n5Txt.setStyle("-fx-border-color: " + blue);
        n6Txt.setStyle("-fx-border-color: " + blue);

    }

}
