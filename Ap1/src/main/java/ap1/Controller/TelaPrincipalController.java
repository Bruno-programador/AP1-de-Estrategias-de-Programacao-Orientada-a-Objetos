package ap1.Controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Bruno 5600
 */
public class TelaPrincipalController implements Initializable {
    
    @FXML
    private VBox principalInfo;
    @FXML
    private VBox janelaprincipal;

    @FXML
    public void showCRUDcliente() throws IOException {
        FXMLLoader loader = new FXMLLoader(TelaPrincipalController.class.getResource("/ap1/CRUDcliente.fxml"));
        
        Scene scene = new Scene(loader.load());
        Stage stageCliente = new Stage();
        stageCliente.setScene(scene);
        ap1.App.iniciarDono(stageCliente);
        stageCliente.setResizable(false);
        stageCliente.setTitle("CRUD Cliente");
        janelaprincipal.setDisable(true);
        stageCliente.showAndWait();
        janelaprincipal.setDisable(false);
    }
    
    @FXML
    public void showCRUDmotocicleta() throws IOException {
        FXMLLoader loader = new FXMLLoader(TelaPrincipalController.class.getResource("/ap1/CRUDmotocicleta.fxml"));
        
        Scene scene = new Scene(loader.load());
        Stage stageMotocicleta = new Stage();
        stageMotocicleta.setScene(scene);
        ap1.App.iniciarDono(stageMotocicleta);
        stageMotocicleta.setResizable(false);
        stageMotocicleta.setTitle("CRUD Motocicleta");
        janelaprincipal.setDisable(true);
        stageMotocicleta.showAndWait();
        janelaprincipal.setDisable(false);
    }
    
    @FXML
    public void showRegCliente() throws IOException {
        VBox loader = (VBox) FXMLLoader.load(TelaPrincipalController.class.getResource("/ap1/RegCliente.fxml"));
        principalInfo.getChildren().setAll(loader);
    }
    
    @FXML
    public void showRegMotocicleta() throws IOException {
        VBox loader = (VBox) FXMLLoader.load(TelaPrincipalController.class.getResource("/ap1/RegMotocicleta.fxml"));
        principalInfo.getChildren().setAll(loader);
    }
    
    @FXML
    public void showVender() throws IOException {
        FXMLLoader loader = new FXMLLoader(TelaPrincipalController.class.getResource("/ap1/Vender.fxml"));
        
        Scene scene = new Scene(loader.load());
        Stage stageVender = new Stage();
        stageVender.setScene(scene);
        ap1.App.iniciarDono(stageVender);
        stageVender.setResizable(false);
        stageVender.setTitle("Vender");
        janelaprincipal.setDisable(true);
        stageVender.showAndWait();
        janelaprincipal.setDisable(false);
    }
    
    @FXML
    public void ShowHistorico() throws IOException {
        VBox loader = (VBox) FXMLLoader.load(TelaPrincipalController.class.getResource("/ap1/Historico.fxml"));
        principalInfo.getChildren().setAll(loader);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            FXMLLoader.load(TelaPrincipalController.class.getResource("/ap1/RegCliente.fxml"));
        } catch (IOException ex) {
        }
        try {
            FXMLLoader.load(TelaPrincipalController.class.getResource("/ap1/RegMotocicleta.fxml"));
        } catch (IOException ex) {
        }
        try {
            FXMLLoader.load(TelaPrincipalController.class.getResource("/ap1/Historico.fxml"));
        } catch (IOException ex) {
        }
    }
    
}
