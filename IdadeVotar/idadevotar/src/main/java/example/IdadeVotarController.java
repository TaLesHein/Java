package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

public class IdadeVotarController {

    @FXML
    private Button btnCalc;

    @FXML
    private TextField idadeTxt;

    @FXML
    private Label labelIdade;

    @FXML
    private Label labelSituacao;

    @FXML
    private Label labelVotar;

    int idade, anoNasc;
    String sit, votar;

    
    @FXML
    void btnCalcClick(ActionEvent event) {

        // Nascimento
        anoNasc = Integer.parseInt(idadeTxt.getText());
        idade = 2023 - anoNasc;

        // Idade
        labelIdade.setText(Integer.toString(idade));

        // Situação
        sit = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
        labelSituacao.setText(sit);

        // Votar
        if (sit.equals("Menor de Idade") && idade < 16) {
            labelVotar.setText("Não pode Votar");
        } else {
            votar = (idade >= 16 && idade < 18) || (idade > 70) ? "Opcional" : "Obrigatório";
            labelVotar.setText(votar);
        }
    }

}
