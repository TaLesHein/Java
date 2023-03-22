package example;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;

public class VetController {

    @FXML
    Button btnAdc;

    @FXML
    Button btnRem;

    @FXML
    Button btnOrd;

    @FXML
    Label lblVet;

    @FXML
    ListView<Integer> listView;

    @FXML
    Spinner<Integer> spin;

    int vet[] = new int[5];
    int select = 0;

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    @FXML
    void initialize() {

        CreateVet();

        // Definindo e configurndo os valores do spinner (min, max e inicial)
        SpinnerValueFactory<Integer> spinValue = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9);
        spinValue.setValue(0);

        spin.setValueFactory(spinValue);

        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {

                select = listView.getSelectionModel().getSelectedIndex();

                if (select < 0){
                    select = 0;
                }

                String selectTxt = Integer.toString(select);
                lblVet.setText("[ " + selectTxt + " ]");
            }
        });
    }

    @FXML
    void btnAdcClick(ActionEvent event) {

        // Passando o valor do spinner para uma variável
        int spinNum = spin.getValue();

        // Definindo a opção selecionada com o valor do spinner
        vet[select] = spinNum;

        // MétodoS para limpar a lista atual e adicionar uma nova lista
        ClearLists();
        ListViewAdd();
    }

    @FXML
    void btnRemClick(ActionEvent event) {

        // Remover o valor selecionado da lista
        vet[select] = 0;

        // Apagar lista atual e criar uma nova
        ClearLists();
        ListViewAdd();
    }

    @FXML
    void btnOrdClick(ActionEvent event) {

        // Coloca a lista em ordem
        Arrays.sort(vet);

        // Apagar lista atual e criar uma nova
        ClearLists();
        ListViewAdd();
    }

    void ClearLists() {
        arrayList.clear(); // Limpa o array
        listView.getItems().clear(); // Limpa a lista
    }

    void ListViewAdd() {
        // Laço for para reescrever os vetores e passa-los para o array
        for (int i = 0; i <= vet.length - 1; i++) {
            arrayList.add(vet[i]);
        }
        // Passando os valores do array para a listView
        listView.getItems().addAll(arrayList);
    }

    void CreateVet(){

        for (int i = 0; i<=vet.length - 1; i++){
            vet[i] = 0;
        }

        ListViewAdd();
    }
}
