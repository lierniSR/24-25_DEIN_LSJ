/**
 * Paquete que contiene la clase HelloController.
 * @author Lierni
 * @version 1.0
 * @since 1.0
 */
package es.liernisarraoa.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Clase que controla la lógica de la aplicación.
 */
public class HelloController {

    /**
     * Botón que inicia la operación de cálculo.
     */
    @FXML
    private Button botonCalcular;

    /**
     * Botón de radio que selecciona la operación de división.
     */
    @FXML
    private RadioButton division;

    /**
     * Grupo de botones de radio que agrupa las operaciones.
     */
    @FXML
    private ToggleGroup grupoRadio;

    /**
     * Botón de radio que selecciona la operación de multiplicación.
     */
    @FXML
    private RadioButton multiplicacion;

    /**
     * Campo de texto que ingresa el primer operador.
     */
    @FXML
    private TextField operador1;

    /**
     * Campo de texto que ingresa el segundo operador.
     */
    @FXML
    private TextField operador2;

    /**
     * Campo de texto que muestra el resultado de la operación.
     */
    @FXML
    private TextField respuesta;

    /**
     * Botón de radio que selecciona la operación de resta.
     */
    @FXML
    private RadioButton resta;

    /**
     * Botón de radio que selecciona la operación de suma.
     */
    @FXML
    private RadioButton suma;

    /**
     * Método que se ejecuta cuando se presiona el botón de calcular.
     * @param event evento de acción que se produce al presionar el botón.
     */
    @FXML
    void onCalcular(ActionEvent event) {
        // Obtenemos el botón de radio seleccionado en el grupo de botones de radio.
        RadioButton radioSeleccionado = (RadioButton) grupoRadio.getSelectedToggle();

        // Verificamos si se seleccionó la operación de suma.
        if (radioSeleccionado == suma){
            // Realizamos la suma de los dos operadores y mostramos el resultado.
            int solucion = Integer.parseInt(operador2.getText()) + Integer.parseInt(operador1.getText());
            respuesta.setText(String.valueOf(solucion));
        }

        // Verificamos si se seleccionó la operación de resta.
        if (radioSeleccionado == resta){
            // Verificamos si el primer operador es menor que el segundo para realizar la resta correcta.
            if (Integer.parseInt(operador1.getText()) < Integer.parseInt(operador2.getText())) {
                // Realizamos la resta del segundo operador menos el primero y mostramos el resultado.
                int solucion = Integer.parseInt(operador2.getText()) - Integer.parseInt(operador1.getText());
                respuesta.setText(String.valueOf(solucion));
            } else  {
                // Realizamos la resta del primer operador menos el segundo y mostramos el resultado.
                int solucion = Integer.parseInt(operador1.getText()) - Integer.parseInt(operador2.getText());
                respuesta.setText(String.valueOf(solucion));
            }
        }

        // Verificamos si se seleccionó la operación de multiplicación.
        if (radioSeleccionado == multiplicacion){
            // Realizamos la multiplicación de los dos operadores y mostramos el resultado.
            int solucion = Integer.parseInt(operador1.getText()) * Integer.parseInt(operador2.getText());
            respuesta.setText(String.valueOf(solucion));
        }

        // Verificamos si se seleccionó la operación de división.
        if (radioSeleccionado == division){
            // Verificamos si alguno de los operadores es cero para evitar la división por cero.
            if(Integer.parseInt(operador1.getText()) == 0 || Integer.parseInt(operador2.getText()) == 0){
                // Mostramos un mensaje de error si se intenta dividir por cero.
                respuesta.setText("No se puede hacer la división ya que algún operador es igual a 0.");
            } else {
                // Realizamos la división del primer operador entre el segundo y mostramos el resultado.
                int solucion = Integer.parseInt(operador1.getText()) / Integer.parseInt(operador2.getText());
                respuesta.setText(String.valueOf(solucion));
            }
        }
    }

}
