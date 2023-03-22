package example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;

public class TrianguloController implements Initializable {

    @FXML
    private Button btnVerificar;

    @FXML
    private Label lblA;

    @FXML
    private Label lblB;

    @FXML
    private Label lblC;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblTipo;

    @FXML
    private AnchorPane paneResposta;

    @FXML
    private Slider slidA;

    @FXML
    private Slider slidB;

    @FXML
    private Slider slidC;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        // Sumir com o anchorPane das respostas
        paneResposta.setVisible(false);

        // Definindo um observador no Slider A
        slidA.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                
                // Passando o valor do slide para o label A
                lblA.setText(Integer.toString((int) slidA.getValue()));
                
            }
        });

        // Definindo um observador no Slider B
        slidB.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                
                // Passando o valor do slide para o label B
                lblB.setText(Integer.toString((int) slidB.getValue()));

            }
        });

        // Definindo um observador no Slider C
        slidC.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                
                // Passando o valor do slide para o label C
                lblC.setText(Integer.toString((int) slidC.getValue()));
                
            }
        });
        
    }

    @FXML
    void btnVerificarClick(ActionEvent event) {
        paneResposta.setVisible(true);

        int a = (int) slidA.getValue();
        int b = (int) slidB.getValue();
        int c = (int) slidC.getValue();

        if (a< b+c && b < a+c && c < a+b ){
            lblStatus.setText("Forma um Triângulo");

            if (a==b && b==c){
                lblTipo.setText("Equilátero");
            }
            else if (a!=b && a!=b && b!=c ){
                lblTipo.setText("Escaleno");
            }
            else{
                lblTipo.setText("Isósceles");
            }
        }
        else{
            lblStatus.setText("Não é um Triângulo");
            lblTipo.setText("---------");
        }
    }

}
