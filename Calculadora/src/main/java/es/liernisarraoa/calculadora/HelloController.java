package es.liernisarraoa.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloController {

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
        RadioButton radioSeleccionado = (RadioButton) grupoRadio.getSelectedToggle();
        if (radioSeleccionado == suma){
            int solucion = Integer.parseInt(operador2.getText()) + Integer.parseInt(operador1.getText());
            respuesta.setText(String.valueOf(solucion));
        }
        if (radioSeleccionado == resta){
            if (Integer.parseInt(operador1.getText()) < Integer.parseInt(operador2.getText())) {
                int solucion = Integer.parseInt(operador2.getText()) - Integer.parseInt(operador1.getText());
                respuesta.setText(String.valueOf(solucion));
            } else  {
                int solucion = Integer.parseInt(operador1.getText()) - Integer.parseInt(operador2.getText());
                respuesta.setText(String.valueOf(solucion));
            }
        }
        if (radioSeleccionado == multiplicacion){
            int solucion = Integer.parseInt(operador1.getText()) * Integer.parseInt(operador2.getText());
            respuesta.setText(String.valueOf(solucion));
        }
        if (radioSeleccionado == division){
            if(Integer.parseInt(operador1.getText()) == 0 || Integer.parseInt(operador2.getText()) == 0){
                respuesta.setText("No se puede hacer la division ya que algún operador es igual a 0.");
            } else {
                int solucion = Integer.parseInt(operador1.getText()) / Integer.parseInt(operador2.getText());
                respuesta.setText(String.valueOf(solucion));
            }
        }
    }

}
