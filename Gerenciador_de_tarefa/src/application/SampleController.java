package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SampleController {
	
	
	
    @FXML
    private Button add;

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
}
