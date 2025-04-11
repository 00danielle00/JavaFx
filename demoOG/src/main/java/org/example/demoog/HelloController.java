package org.example.demoog;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    static int contador;
    @FXML
    private Label welcomeText;

    @FXML
    public Button contar;

    @FXML
    public void initialize(){
        contar.setOnAction(e -> System.out.println(++contador));
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}