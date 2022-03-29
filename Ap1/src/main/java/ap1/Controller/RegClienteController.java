/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ap1.Controller;

import ap1.Classes.Cliente;
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
public class RegClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ListView<Cliente> regClienteList;
    @FXML
    private Label regClienteId;
    @FXML
    private Label regClienteNome;
    @FXML
    private Label regClienteCPF;
    
    private static ObservableList<Cliente> observableList;
    
    private static ListView<Cliente> lista;
           

    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        lista = regClienteList;
        AtualizarValoresCliente();
    }
    
    @FXML
    public void atualizarInfoCliente(){
        regClienteId.setText(Integer.toString(lista.getSelectionModel().getSelectedItem().getId()));
        regClienteNome.setText(lista.getSelectionModel().getSelectedItem().getNome());
        regClienteCPF.setText(lista.getSelectionModel().getSelectedItem().getCPF());
    }
    
    public static void AtualizarValoresCliente(){
        observableList = FXCollections.observableArrayList(ap1.Controller.CRUDclienteController.listaCliente);
        lista.setItems(observableList);
    }
}
