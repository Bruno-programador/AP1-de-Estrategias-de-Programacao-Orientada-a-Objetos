package ap1.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import ap1.Classes.Motocicleta;

/**
 *
 * @author Bruno 5600
 */
public class CRUDmotocicletaController implements Initializable {

    @FXML
    private VBox telaMotocicleta;
    
    @FXML
    private TextField motocicletaID;
    @FXML
    private TextField motocicletaModelo;
    @FXML
    private TextField motocicletaPreco;
    
    private Motocicleta motocicleta = new Motocicleta();

    public static List<Motocicleta> listaMotocicleta = new ArrayList();
    
    
    public void sair() {
        ((Stage) telaMotocicleta.getScene().getWindow()).close();
    }
    
    @FXML
    public void pegarValores(){
        motocicleta.setId(Integer.parseInt(motocicletaID.getText()));
        motocicleta.setModelo(motocicletaModelo.getText());
        motocicleta.setPreco(Double.valueOf(motocicletaPreco.getText()));

        listaMotocicleta.add(motocicleta);
                
        sair();
        ap1.Controller.RegMotocicletaController.AtualizarValoresMotocicleta();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
