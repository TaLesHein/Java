package example;

import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;

public class RepeatController{
    
    @FXML
    private Button btnCont;

    @FXML
    private Label lblIni;

    @FXML
    private Label lblFim;

    @FXML
    private Label lblPass;

    @FXML
    private ListView<Integer> lblList;

    @FXML
    private Slider slidIni;

    @FXML
    private Slider slidFim;

    @FXML
    private Slider slidPass;

    
    ArrayList <Integer> list = new ArrayList<Integer>();


    @FXML
    void initialize(){
        
        // Definindo os obsevadores nos sliders e mudando o label conforme seu valor
        slidIni.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2){

                lblIni.setText(Integer.toString((int) slidIni.getValue()));
            }
        });

        slidFim.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2){

                lblFim.setText(Integer.toString((int) slidFim.getValue()));
            }
        });

        slidPass.valueProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2){

                lblPass.setText(Integer.toString((int) slidPass.getValue()));
            }
        });
        // .


    }
    @FXML
    void btnContClick (ActionEvent event){

        int ini = Integer.parseInt(lblIni.getText());
        int f = Integer.parseInt(lblFim.getText());
        int p = Integer.parseInt(lblPass.getText());

        list.clear();
        lblList.getItems().clear();

        for (int i = ini; i <= f; i += p){

            list.add(i);
        }

        lblList.getItems().addAll(list);
        
    }
}