package domain;

import exceptions.*;

public class Prenda {
	TipoDePrenda tipo;
	Categoria categoria;
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	Trama trama;
	float temperaturaMaximaAdecuada;
	
	public Prenda(TipoDePrenda tipo, Categoria categoria, Material material, Color colorPrincipal, Color colorSecundario, Trama trama, float temperaturaMaximaAdecuada) {
		this.tipo = tipo;
		this.categoria = categoria;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
		this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
		
		if (trama == null) {
			this.trama = Trama.LISA;
		}
		else {
			this.trama = trama;
		}
	}
	
	public boolean tieneCategoria(Categoria categoria) {
		return this.categoria == categoria;
	}
	
	public boolean tieneColorSecundario() {
		return colorSecundario != null;
	}

	public boolean esAptaParaLaTemperaturaActual() {
		return temperaturaMaximaAdecuada <= Clima.instance().obtenerClimaActual();
	}
	
}
