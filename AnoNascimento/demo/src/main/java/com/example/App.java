package com.example;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL arquivoFXML = getClass().getResource("anoNascimento.fxml");
        Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
        stage.setScene(new Scene(fxmlParent));
        stage.show();
    }
}