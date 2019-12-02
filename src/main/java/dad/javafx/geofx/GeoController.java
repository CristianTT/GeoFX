package dad.javafx.geofx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.service.IPAPIService;
import dad.javafx.geofx.service.IPIFYService;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.NumberStringConverter;

public class GeoController implements Initializable {

	@FXML
	private AnchorPane root;
	@FXML
	private Label ipLocation, latitude, longitude, city, language, callingCode, zipCode, timezone, currency,
			registeredISP, ipAddress, type, hostname, ASN, isSecure, threatLevel, potentialThreatTypes;
	@FXML
	private CheckBox proxyDetected, crawlerDetected, torDetected;
	@FXML
	private TextField ipText;
	@FXML
	private ImageView ipLocationImage;

	IPIFYService IpService = new IPIFYService();
	IPAPIService GeoService = new IPAPIService();
	GeoModel model;;

	public GeoController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeoView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			ipText.setText(IpService.getMyIp());
			model = new GeoModel(GeoService.ipData(ipText.getText()));
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("GeoFX");
			alert.setHeaderText("Ha ocurrido un error");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
			e.printStackTrace();
		}
		
		// Bindings
		ipLocation.textProperty().bind(
				Bindings.concat(model.geolocationProperty().get().country_nameProperty(), " (", model.geolocationProperty().get().country_codeProperty(), ")"));
		latitude.textProperty().bindBidirectional(model.geolocationProperty().get().latitudeProperty(), new NumberStringConverter());
		longitude.textProperty().bindBidirectional(model.geolocationProperty().get().longitudeProperty(), new NumberStringConverter());
		city.textProperty().bindBidirectional(model.geolocationProperty().get().cityProperty());
		language.textProperty().bind(Bindings.createObjectBinding(() -> {
			return model.geolocationProperty().get().locationProperty().get().languagesProperty().get(0).getName();
		}, model.geolocationProperty().get().locationProperty().get().languagesProperty()));
		callingCode.textProperty().bind(model.geolocationProperty().get().locationProperty().get().calling_codeProperty());
		zipCode.textProperty().bindBidirectional(model.geolocationProperty().get().zipProperty());
		ipAddress.textProperty().bindBidirectional(model.geolocationProperty().get().ipProperty());
		type.textProperty().bindBidirectional(model.geolocationProperty().get().typeProperty());
		ipLocationImage.imageProperty().bind(Bindings.createObjectBinding(() -> {
			return new Image("/images/flags/" + model.geolocationProperty().get().getCountry_code() + ".png", true);
		}, model.geolocationProperty().get().country_codeProperty()));
	}

	public AnchorPane getView() {
		return root;
	}

	@FXML
	void checkIpAction(ActionEvent event) {
		try {
			model.setGeolocation(GeoService.ipData(ipText.getText()));
			
			// Setter
			/*ipLocation.setText(model.getCountry_name() + " (" + model.getCountry_code() + ")");
			latitude.setText("" + model.getLatitude());
			longitude.setText("" + model.getLongitude());
			city.setText(model.getCity());
			language.setText(model.getLocation().getLanguages().get(0).getName());
			callingCode.setText("+" + model.getLocation().getCalling_code());
			zipCode.setText(model.getZip());
			ipAddress.setText(model.getIp());
			type.setText(model.getType());
			Image i = new Image("/images/flags/" + model.getCountry_code() + ".png", true);
			ipLocationImage.setImage(i);*/
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("GeoFX");
			alert.setHeaderText("Ha ocurrido un error");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
			e.printStackTrace();
		}
	}
}
