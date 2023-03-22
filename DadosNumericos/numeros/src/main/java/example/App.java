package example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    Stage stage = new Stage();
    

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("telaNumero.fxml"));
        scene = new Scene(parent);
        this.stage = stage;
        stage.setScene(scene);
        stage.show();

    }

    public void switchScene(String fxml) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("telaDados.fxml"));
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}