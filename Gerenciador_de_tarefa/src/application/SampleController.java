package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import system.SystemGerenciador;


public class SampleController {
	
	static SystemGerenciador sys;
	
    @FXML
    private Button add;
    
    @FXML
    private Label title;
    
    @FXML
    private Label descri;
    
    

    public SampleController() {
    	sys = new SystemGerenciador();
    }
    @FXML
    void addOnAction(ActionEvent event) throws IOException {
    	
    	AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formularioProjeto.fxml"));
    	Scene sceneform = new Scene(form,600,400);
    	Main.aux.setScene(sceneform);
     
    }
    
    @FXML
    void backOnAction(ActionEvent event) throws IOException {
    	AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	Scene sceneform = new Scene(form,600,400);
    	Main.aux.setScene(sceneform);
    }
    
    @FXML
    void criaProjetoOnAction(ActionEvent event)throws IOException{
    	sys.criarProjeto(title.getText(),descri.getText());
    }
}
