
package dad.javafx;

import dad.javafx.geofx.GeoController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author CTT
 */
public class GeoFXApp extends Application {
	
	private GeoController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new GeoController();
		Scene scene = new Scene(controller.getView());
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
