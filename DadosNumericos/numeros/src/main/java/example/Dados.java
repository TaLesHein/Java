package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Dados {

    @FXML
    private Button btnCont;

    @FXML
    private Label lblAcima;

    @FXML
    private Label lblImp;

    @FXML
    private Label lblMedia;

    @FXML
    private Label lblPar;

    @FXML
    private Label lblSoma;

    Informacoes info;

    int cont, soma, par, imp, acima, media;

    @FXML
    void initialize() {

        getInfo();
        // Total da Soma
        lblSoma.setText(Integer.toString(soma));

        // Total de Pares
        lblPar.setText(Integer.toString(par));

        // Total de Ímpares
        lblImp.setText(Integer.toString(imp));

        // Total de Números Acima
        lblAcima.setText(Integer.toString(acima));

        // Média de todos os Números

        lblMedia.setText(Integer.toString(media));

    }

    void getInfo() {

        System.out.println("Chegou aqui no getInfo");
        // Pegar as informações da classe Informacoes por meio dos getters
        cont = info.getCont();
        soma = info.getSoma();
        par = info.getPar();
        imp = info.getImp();
        acima = info.getAcima();
    }

    @FXML
    void btnContClick(ActionEvent event) {

    }

}
