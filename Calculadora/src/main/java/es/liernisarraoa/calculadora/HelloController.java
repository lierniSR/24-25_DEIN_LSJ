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
 * @author Lierni
 * @version 1.0
 * @since 1.0
 */
public class HelloController {

    /**
     * Los siguientes metodos son los elementos que necesitamos tanto su informacion como un cambio en el
     */
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

    /**
     * Metodo que se ejecuta cuando se presiona el botón de calcular.
     * @param event evento de acción que se produce al presionar el botón.
     */
    @FXML
    void onCalcular(ActionEvent event) {
        /**
         * Obtenemos el botón de radio seleccionado en el grupo de botones de radio.
          */
        RadioButton radioSeleccionado = (RadioButton) grupoRadio.getSelectedToggle();

        /**
         * Verificamos si se seleccionó la operación de suma.
         */
        if (radioSeleccionado == suma){

            /**
             * Realizamos la suma de los dos operadores y mostramos el resultado.
             */
            int solucion = Integer.parseInt(operador2.getText()) + Integer.parseInt(operador1.getText());
            respuesta.setText(String.valueOf(solucion));
        }

        /**
         * Verificamos si se seleccionó la operación de resta.
         */
        if (radioSeleccionado == resta){

            /**
             * Verificamos si el primer operador es menor que el segundo para realizar la resta correcta.
             */
            if (Integer.parseInt(operador1.getText()) < Integer.parseInt(operador2.getText())) {

                /**
                 * Realizamos la resta del segundo operador menos el primero y mostramos el resultado.
                 */
                int solucion = Integer.parseInt(operador2.getText()) - Integer.parseInt(operador1.getText());
                respuesta.setText(String.valueOf(solucion));
            } else  {

                /**
                 * Realizamos la resta del primer operador menos el segundo y mostramos el resultado.
                 */
                int solucion = Integer.parseInt(operador1.getText()) - Integer.parseInt(operador2.getText());
                respuesta.setText(String.valueOf(solucion));
            }
        }

        /**
         * Verificamos si se seleccionó la operación de multiplicación.
         */
        if (radioSeleccionado == multiplicacion){

            /**
             * Realizamos la multiplicación de los dos operadores y mostramos el resultado.
             */
            int solucion = Integer.parseInt(operador1.getText()) * Integer.parseInt(operador2.getText());
            respuesta.setText(String.valueOf(solucion));
        }

        /**
         * Verificamos si se seleccionó la operación de división.
         */
        if (radioSeleccionado == division){

            /**
             * Verificamos si alguno de los operadores es cero para evitar la división por cero.
             */
            if(Integer.parseInt(operador1.getText()) == 0 || Integer.parseInt(operador2.getText()) == 0){

                /**
                 * Mostramos un mensaje de error si se intenta dividir por cero.
                 */
                respuesta.setText("No se puede hacer la división ya que algún operador es igual a 0.");
            } else {

                /**
                 * Realizamos la división del primer operador entre el segundo y mostramos el resultado.
                 */
                int solucion = Integer.parseInt(operador1.getText()) / Integer.parseInt(operador2.getText());
                respuesta.setText(String.valueOf(solucion));
            }
        }
    }

}
