package dad.javafx.geofx.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class IPIFYService {

	public IPIFYService() {
		Unirest.setObjectMapper(new UnirestObjectMapper());
	}

	public String getMyIp() throws Exception {
		String ip = "";
		try {
			ip = Unirest.get("https://api.ipify.org")
					.asObject(String.class).getBody();
			if (ip.isEmpty()) {
				throw new Exception("No se ha podido obtener tu IP");
			}
		} catch (UnirestException e) {
			throw new Exception("Error " + e.getMessage());
		}
		return ip;
	}
}
