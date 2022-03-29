/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ap1.Controller;

import ap1.Classes.Vendas;
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
public class HistoricoController implements Initializable {
    
    @FXML
    private ListView<Vendas> historicoLista;
    @FXML
    private Label hisCliente;
    @FXML
    private Label hisMotocicleta;
    @FXML
    private Label hisParcelas;
    @FXML
    private Label hisPreco;
    @FXML
    private Label hisPrecoParcela;
    
    private static ObservableList<Vendas> observableList;
    
    private static ListView<Vendas> lista;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lista = historicoLista;
        AtualizarValoresHistorico();
    }    
    
    @FXML
    public void atualizarInfoHistorico(){
        hisCliente.setText(lista.getSelectionModel().getSelectedItem().getCliente().getNome());
        hisMotocicleta.setText(lista.getSelectionModel().getSelectedItem().getMotocicleta().getModelo());
        hisParcelas.setText(lista.getSelectionModel().getSelectedItem().getParcelas());
        hisPreco.setText(String.format("%,.02f", lista.getSelectionModel().getSelectedItem().getMotocicleta().getPreco()));
        hisPrecoParcela.setText(String.format("%,.02f", lista.getSelectionModel().getSelectedItem().getValorParcelas()));
    }
    
    public static void AtualizarValoresHistorico(){
        observableList = FXCollections.observableArrayList(ap1.Controller.VenderController.listaVendas);
        lista.setItems(observableList);
    }
}
