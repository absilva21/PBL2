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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import system.Projeto;
import system.SystemGerenciador;
/*******************************************************************************
Autor: Alisson Bomfim da Silva e Alexandre Silva Carib�
Componente Curricular: Algoritmos e Programa��o II
Concluido em: 14/10/2011
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
/**
 * @author alisson
 * @author Alexandre
 */

public class SampleController {
	
	
	
    @FXML
    private Button add;
    
    @FXML
    private TextField title;
    
    @FXML
    private TextArea descri;
    
    
    @FXML
    void addOnAction(ActionEvent event) throws IOException {
    	
    	AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formularioProjeto.fxml"));
    	Scene sceneform = new Scene(form,600,400);
    	Main.aux.setScene(sceneform);
     
    }
    
    @FXML
    void backOnAction(ActionEvent event) throws IOException {
    	carregarProjetos();
    }
    
    @FXML
    void criaProjetoOnAction(ActionEvent event)throws IOException{
    	Main.sysRef.criarProjeto(title.getText(),descri.getText());
    	carregarProjetos();
    	
    }
    
    public void carregarProjetos() throws IOException{
    	Main.sysRef.getProjetos().resetIndex();
    	Projeto a = Main.sysRef.getProjetos().next();
    	HBox home = (HBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	if(a!=null) {
    		VBox pro = new VBox();
	    	Label title = new Label(a.getTitulo());
	    	Label descri = new Label(a.getDescricao());
	    	Button deta = new Button("ver tarefas");
	    	deta.setId(a.getTitulo());
	    	pro.getChildren().addAll(title,descri,deta);
	    	home.getChildren().addAll(pro);
    	}
    	
    	
    	while(Main.sysRef.getProjetos().getIndex()!=null) {
    		a = Main.sysRef.getProjetos().next();
    		VBox pro = new VBox();
    	    Label title = new Label(a.getTitulo());
    	    Label descri = new Label(a.getDescricao());
    	    Button deta = new Button("ver tarefas");
    	    deta.setId(a.getTitulo());
    	    pro.getChildren().addAll(title,descri,deta);
    	    home.getChildren().addAll(pro);
    	    
        	
   
    	}
    	
    	Scene sceneform = new Scene(home,600,400);
    	Main.aux.setScene(sceneform);
    	
    }
}
