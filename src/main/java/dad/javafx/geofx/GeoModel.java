package dad.javafx.geofx;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class GeoModel {
	
	private ObjectProperty<Geolocation> geolocation = new SimpleObjectProperty<Geolocation>();
	
	public GeoModel(Geolocation geo) {
		this.geolocation.set(geo);
	}

	public final ObjectProperty<Geolocation> geolocationProperty() {
		return this.geolocation;
	}

	public final Geolocation getGeolocation() {
		return this.geolocationProperty().get();
	}

	public final void setGeolocation(final Geolocation geolocation) {
		this.geolocationProperty().get().cityProperty().set(geolocation.getCity());
		this.geolocationProperty().get().continent_codeProperty().set(geolocation.getContinent_code());
		this.geolocationProperty().get().continent_nameProperty().set(geolocation.getContinent_name());
		this.geolocationProperty().get().country_codeProperty().set(geolocation.getCountry_code());
		this.geolocationProperty().get().country_nameProperty().set(geolocation.getCountry_name());
		this.geolocationProperty().get().errorProperty().set(geolocation.getError());
		this.geolocationProperty().get().ipProperty().set(geolocation.getIp());
		this.geolocationProperty().get().latitudeProperty().set(geolocation.getLatitude());
		this.geolocationProperty().get().locationProperty().set(geolocation.getLocation());
		this.geolocationProperty().get().longitudeProperty().set(geolocation.getLongitude());
		this.geolocationProperty().get().region_codeProperty().set(geolocation.getRegion_code());
		this.geolocationProperty().get().region_nameProperty().set(geolocation.getRegion_name());
		this.geolocationProperty().get().successProperty().set(geolocation.getSuccess());
		this.geolocationProperty().get().typeProperty().set(geolocation.getType());
		this.geolocationProperty().get().zipProperty().set(geolocation.getZip());
	}

}
