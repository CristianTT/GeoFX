package dad.javafx.geofx;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GeoModel {

	private BooleanProperty success = new SimpleBooleanProperty();
	private StringProperty ip = new SimpleStringProperty();
	private StringProperty type = new SimpleStringProperty();
	private StringProperty continent_code = new SimpleStringProperty();
	private StringProperty continent_name = new SimpleStringProperty();
	private StringProperty country_code = new SimpleStringProperty();
	private StringProperty country_name = new SimpleStringProperty();
	private StringProperty region_code = new SimpleStringProperty();
	private StringProperty region_name = new SimpleStringProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty zip = new SimpleStringProperty();
	private DoubleProperty latitude = new SimpleDoubleProperty();
	private DoubleProperty longitude = new SimpleDoubleProperty();
	private ObjectProperty<Location> location = new SimpleObjectProperty<Location>();
	private StringProperty error = new SimpleStringProperty();

	public GeoModel() {
	}

	public GeoModel(String ip, String type, String continentCode, String continentName, String countryCode,
			String countryName, String regionCode, String regionName, String city, String zip, Double latitude,
			Double longitude, Location location, boolean success) {
		super();
		this.ip.set(ip);
		this.type.set(type);
		this.continent_code.set(continentCode);
		this.continent_name.set(continentName);
		this.country_code.set(countryCode);
		this.country_name.set(countryName);
		this.region_code.set(regionCode);
		this.region_name.set(regionName);
		this.city.set(city);
		this.zip.set(zip);
		this.latitude.set(latitude);
		this.longitude.set(longitude);
		this.location.set(location);
		this.success.set(success);
	}

	@Override
	public String toString() {
		return "GeoModel [success=" + success + ", ip=" + ip + ", type=" + type + ", continent_code=" + continent_code
				+ ", continent_name=" + continent_name + ", country_code=" + country_code + ", country_name="
				+ country_name + ", region_code=" + region_code + ", region_name=" + region_name + ", city=" + city
				+ ", zip=" + zip + ", latitude=" + latitude + ", longitude=" + longitude + ", location=" + location
				+ ", error=" + error + "]";
	}

	public boolean isSuccess() {
		return this.ip.isEmpty().not().get();
	}

	public final StringProperty ipProperty() {
		return this.ip;
	}

	public final String getIp() {
		return this.ipProperty().get();
	}

	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}

	public final StringProperty typeProperty() {
		return this.type;
	}

	public final String getType() {
		return this.typeProperty().get();
	}

	public final void setType(final String type) {
		this.typeProperty().set(type);
	}

	public final StringProperty continent_codeProperty() {
		return this.continent_code;
	}

	public final String getContinent_code() {
		return this.continent_codeProperty().get();
	}

	public final void setContinent_code(final String continentCode) {
		this.continent_codeProperty().set(continentCode);
	}

	public final StringProperty continent_nameProperty() {
		return this.continent_name;
	}

	public final String getContinent_name() {
		return this.continent_nameProperty().get();
	}

	public final void setContinent_name(final String continentName) {
		this.continent_nameProperty().set(continentName);
	}

	public final StringProperty country_codeProperty() {
		return this.country_code;
	}

	public final String getCountry_code() {
		return this.country_codeProperty().get();
	}

	public final void setCountry_code(final String countryCode) {
		this.country_codeProperty().set(countryCode);
	}

	public final StringProperty country_nameProperty() {
		return this.country_name;
	}

	public final String getCountry_name() {
		return this.country_nameProperty().get();
	}

	public final void setCountry_name(final String countryName) {
		this.country_nameProperty().set(countryName);
	}

	public final StringProperty region_codeProperty() {
		return this.region_code;
	}

	public final String getRegion_code() {
		return this.region_codeProperty().get();
	}

	public final void setRegion_code(final String regionCode) {
		this.region_codeProperty().set(regionCode);
	}

	public final StringProperty region_nameProperty() {
		return this.region_name;
	}

	public final String getRegion_name() {
		return this.region_nameProperty().get();
	}

	public final void setRegion_name(final String regionName) {
		this.region_nameProperty().set(regionName);
	}

	public final StringProperty cityProperty() {
		return this.city;
	}

	public final String getCity() {
		return this.cityProperty().get();
	}

	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}

	public final StringProperty zipProperty() {
		return this.zip;
	}

	public final String getZip() {
		return this.zipProperty().get();
	}

	public final void setZip(final String zip) {
		this.zipProperty().set(zip);
	}

	public final DoubleProperty latitudeProperty() {
		return this.latitude;
	}

	public final double getLatitude() {
		return this.latitudeProperty().get();
	}

	public final void setLatitude(final double latitude) {
		this.latitudeProperty().set(latitude);
	}

	public final DoubleProperty longitudeProperty() {
		return this.longitude;
	}

	public final double getLongitude() {
		return this.longitudeProperty().get();
	}

	public final void setLongitude(final double longitude) {
		this.longitudeProperty().set(longitude);
	}

	public final ObjectProperty<Location> locationProperty() {
		return this.location;
	}

	public final Location getLocation() {
		return this.locationProperty().get();
	}

	public final void setLocation(final Location location) {
		this.locationProperty().set(location);
	}

	public final StringProperty errorProperty() {
		return this.error;
	}

	public final String getError() {
		return this.errorProperty().get();
	}

	public final void setError(final String error) {
		this.errorProperty().set(error);
	}

	public final BooleanProperty successProperty() {
		return this.success;
	}

	public final boolean getSuccess() {
		return this.successProperty().get();
	}

	public final void setSuccess(final boolean success) {
		this.successProperty().set(success);
	}

}
