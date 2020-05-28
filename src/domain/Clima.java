package domain;

import java.util.*;

public class Clima {
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	private static Clima INSTANCE = new Clima();
	
	private Clima() {}
	
	static Clima instance() {
		return INSTANCE;
	}
	
	public float obtenerClimaActual() {
		List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”); 
		temperaturaEnFarenheit = condicionesClimaticas.get(0).get("Temperature").get("Value");
		return enCentigrados(temperaturaEnFarenheit);
	}
	
	public float enCentigrados(float temperaturaEnFarenheit) {
		return (temperaturaEnFarenheit - 32) * 5 / 9 ;
	}
}
