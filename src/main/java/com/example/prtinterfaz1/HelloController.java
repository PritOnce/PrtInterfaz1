package com.example.prtinterfaz1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btnsumar;
    @FXML
    private TextField txtop1;
    @FXML
    private TextField txtop2;
    @FXML
    private TextField txtresultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void sumar (ActionEvent evento){
        try{
            //obtener los parametro que mete el usuario
            int operando1=Integer.parseInt(this.txtop1.getText());
            int operando2=Integer.parseInt(this.txtop2.getText());
            //creamos la instancua del metodo
            Suma s = new Suma(operando1,operando2);
            //Hago la suma
            int resultado = s.suma();
            this.txtresultado.setText(resultado + "");
        } catch (NumberFormatException e) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato Incorrecto");
            alert.showAndWait();
        }
    }
}