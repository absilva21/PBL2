package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	static Stage aux;
	static AnchorPane form;
	static AnchorPane home;
	@Override
	public void start(Stage primaryStage) throws IOException {
		aux = primaryStage;
		form = (AnchorPane)FXMLLoader.load(getClass().getResource("formularioProjeto.fxml"));
		home = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
		try {
			
			Scene scene = new Scene(home,600,400);
	
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
