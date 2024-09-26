module es.liernisarraoa.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.liernisarraoa.calculadora to javafx.fxml;
    exports es.liernisarraoa.calculadora;
}