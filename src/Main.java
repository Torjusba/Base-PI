import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application{
	
	Stage window;
	Scene scene1;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		BasePi_to_BaseTen tenConverter = new BasePi_to_BaseTen();
		BaseTen_to_BasePi piConverter = new BaseTen_to_BasePi();
		
		TextField PiField = new TextField();
		TextField TenField = new TextField();
//		PiField.setOnInputMethodTextChanged(e -> {
//			TenField.setText(tenConverter.toTen(PiField.getText()));
//		});
//		TenField.setOnInputMethodTextChanged(e -> {
//			PiField.setText(piConverter.toPi(TenField.getText()));
//		});
		Label PiLabel = new Label("Base Pi");
		Label TenLabel = new Label ("Base Ten");
		Button b1 = new Button("To Base Ten");
		Button b2 = new Button("To Base Pi");
		
		b1.setOnAction(e -> {
			TenField.setText(tenConverter.toTen(PiField.getText()));
		});
		b2.setOnAction(e -> {
			PiField.setText(piConverter.toPi(TenField.getText()));
		});
		
		HBox hb1 = new HBox(10);
		HBox hb2 = new HBox(10);
		VBox vb1 = new VBox(5);
		
		hb1.getChildren().addAll(PiLabel, PiField, b1);
		hb1.setAlignment(Pos.CENTER);
		hb2.getChildren().addAll(TenLabel, TenField, b2);
		hb2.setAlignment(Pos.CENTER);
		vb1.getChildren().addAll(hb1, hb2);
		vb1.setAlignment(Pos.CENTER);
		
		scene1 = new Scene(vb1, 400, 200);
		
		window.setScene(scene1);
		window.setTitle("Base converter");
		window.show();
	}
}
