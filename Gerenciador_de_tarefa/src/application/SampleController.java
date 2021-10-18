package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import system.Projeto;
import system.SystemGerenciador;


public class SampleController {
	
	static SystemGerenciador sys;
	
    @FXML
    private Button add;
    
    @FXML
    private TextField title;
    
    @FXML
    private TextArea descri;
    
    
    public SampleController() {
    	sys = new SystemGerenciador();
    }
    @FXML
    void addOnAction(ActionEvent event) throws IOException {
    	
    
    	Scene sceneform = new Scene(Main.form,600,400);
    	Main.aux.setScene(sceneform);
     
    }
    
    @FXML
    void backOnAction(ActionEvent event) throws IOException {
    	
    	Scene sceneform = new Scene(Main.home,600,400);
    	Main.aux.setScene(sceneform);
    }
    
    @FXML
    void criaProjetoOnAction(ActionEvent event)throws IOException{
    	sys.criarProjeto(title.getText(),descri.getText());
    	carregarProjetos();
    	
    }
    
    public void carregarProjetos(){
    	sys.getProjetos().resetIndex();
    	Projeto a = sys.getProjetos().next();
    	
    	if(a!=null) {
    		VBox pro = new VBox();
	    	Label title = new Label(a.getTitulo());
	    	Label descri = new Label(a.getDescricao());
	    	Button deta = new Button("ver tarefas");
	    	pro.getChildren().addAll(title,descri,deta);
	    	Main.home.getChildren().addAll(pro);
    	}
    	
    	
    	while(sys.getProjetos().getIndex()!=null) {
    		if(a!=null) {
        		VBox pro = new VBox();
    	    	Label title = new Label(a.getTitulo());
    	    	Label descri = new Label(a.getDescricao());
    	    	Button deta = new Button("ver tarefas");
    	    	pro.getChildren().addAll(title,descri,deta);
    	    	Main.home.getChildren().addAll(pro);
    	    	a = sys.getProjetos().next();
        	}else {
        		break;
        	}
    	}
    	
    }
}
