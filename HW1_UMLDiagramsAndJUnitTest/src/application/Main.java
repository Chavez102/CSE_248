package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	public static StudentBag bag=new StudentBag();
	@Override
	public void start(Stage primaryStage) {
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Introduction.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			Student s1=new Student() ;
			bag.insert(s1);
		}
		
		
		launch(args);
	}
	
	

	public static void SwitchPageto(ActionEvent event, String fxmldocumentstr) {
		try {
//			Parent root = FXMLLoader.load(application.Main.class.getResource(fxmldocumentstr)); 
				Parent root = FXMLLoader.load(Pages.Pages_CLass.class.getResource(fxmldocumentstr));
				Scene scene = new Scene(root, 800, 600);
				Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
				window.setScene(scene);

				window.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}
