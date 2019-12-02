package dad.javafx.geofx.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.GeoModel;

public class IPAPIService {

	private String apiKey = "3c4b0c1106fa62b81caf7bf5d43b2341";

	public IPAPIService() {
		Unirest.setObjectMapper(new UnirestObjectMapper());
	}

	public GeoModel ipData(String ip) throws Exception {
		GeoModel geo = new GeoModel();
		try {
			geo = Unirest.get("http://api.ipapi.com/" + ip + "?access_key=" + apiKey + "&format=1")
					.asObject(GeoModel.class).getBody();
			if (!geo.isSuccess()) {
				throw new Exception("No se ha podido conectar a la API");
			}
		} catch (UnirestException e) {
			geo.setError(e.getMessage());
		}
		return geo;
	}

}
