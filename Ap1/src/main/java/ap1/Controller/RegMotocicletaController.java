/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ap1.Controller;

import ap1.Classes.Motocicleta;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


/**
 * FXML Controller class
 *
 * @author Bruno 5600
 */
public class RegMotocicletaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ListView<Motocicleta> regMotocicletaList;
    @FXML
    private Label regMotocicletaId;
    @FXML
    private Label regMotocicletaModelo;
    @FXML
    private Label regMotocicletaPreco;
    
    private static ObservableList<Motocicleta> observableList;
    
    private static ListView<Motocicleta> lista;
           

    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        lista = regMotocicletaList;
        AtualizarValoresMotocicleta();
    }
    
    @FXML
    public void atualizarInfoMotocicleta(){
        regMotocicletaId.setText(Integer.toString(lista.getSelectionModel().getSelectedItem().getId()));
        regMotocicletaModelo.setText(lista.getSelectionModel().getSelectedItem().getModelo());
        regMotocicletaPreco.setText(String.format("%,.02f", lista.getSelectionModel().getSelectedItem().getPreco()));
    }
    
    public static void AtualizarValoresMotocicleta(){
        observableList = FXCollections.observableArrayList(ap1.Controller.CRUDmotocicletaController.listaMotocicleta);
        lista.setItems(observableList);
    }
}