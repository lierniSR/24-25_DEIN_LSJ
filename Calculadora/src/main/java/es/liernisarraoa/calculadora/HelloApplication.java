/**
 * Representa una aplicación JavaFX.
 * @author Lierni
 * @version 1.0
 * @since 1.0
 */
package es.liernisarraoa.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * Esta clase hereda de Application y sobrescribe los métodos start y main.
 * @author Lierni
 * @version 1.0
 * @since 1.0
 */
public class HelloApplication extends Application {

    /**
     * Método que se llama cuando se inicia la aplicación.
     * Se utiliza para configurar la interfaz gráfica de usuario.
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        /**
         * Carga el archivo FXML que define la interfaz gráfica de usuario.
         * El archivo FXML se encuentra en el paquete es.liernisarraoa.calculadora.
         */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Calculadora.fxml"));

        /**
         * Crea una nueva escena con el contenido del archivo FXML.
         * La escena tiene un tamaño de 600x450 píxeles.
         */
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);

        /**
         * Establece el título de la ventana de la aplicación.
         */
        stage.setTitle("Calculadora!");

        /**
         * Establece la escena en el escenario principal.
         */
        stage.setScene(scene);

        /**
         * Muestra la ventana de la aplicación.
         */
        stage.show();
    }

    /**
     * Método principal de la aplicación.
     * Se llama cuando se ejecuta la aplicación.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        /**
         * Lanza la aplicación JavaFX.
         * 
         */
        launch();
    }
}