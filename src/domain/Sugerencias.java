package domain;

import java.util.List;

public class Sugerencias {
	public List<Atuendo> generarSugerencia(List<Prenda> prendasAptas){
		return null;
	}// Genera atuendos con prendas de cada categoria
	
	public List<Atuendo> generarSugerenciaAptaParaElClima(List<Prenda> prendasAptas){
		return generarSugerencia(prendasAptas.stream().filter(prenda -> prenda.esAptaParaLaTemperaturaActual()).toList());
	}
}
