package example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Numeros {

    @FXML
    private Button btnConf;

    @FXML
    private TextField txtField;

    int num, soma, par, imp, acima, cont;

    Informacoes info;
    App app = new App();

    @FXML
    void btnConfClick(ActionEvent event) throws IOException {

        if (Integer.parseInt(txtField.getText()) == 0) {

            info.definirInfo(cont, soma, par, imp, acima);
            app.switchScene("telaDado.fxml");

        } else {
            // Contagem de números
            cont++;

            // Soma
            num = Integer.parseInt(txtField.getText());
            soma += num;

            // Par e ímpar

            if (num % 2 == 0) {
                par++;
            } else {
                imp++;
            }

            // Acima de 100
            if (num > 100) {
                acima++;
            }
            System.out.println("-------------------");
            System.out.println("Tot contador: " + cont);
            System.out.println("Tot soma: " + soma);
            System.out.println("Tot par: " + par);
            System.out.println("Tot ímpar: " + imp);
            System.out.println("Tot acima: " + acima);
            System.out.println("Tot média: " + soma / cont);
            System.out.println("-------------------");
            System.out.println("");
        }
    }

}
