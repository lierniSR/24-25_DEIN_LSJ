package es.liernisarraoa.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloApplication {

    @FXML
    private Button botonCalcular;

    @FXML
    private RadioButton division;

    @FXML
    private ToggleGroup grupoRadio;

    @FXML
    private RadioButton multiplicacion;

    @FXML
    private TextField operador1;

    @FXML
    private TextField operador2;

    @FXML
    private TextField respuesta;

    @FXML
    private RadioButton resta;

    @FXML
    private RadioButton suma;

    @FXML
    void onCalcular(ActionEvent event) {

    }

}
