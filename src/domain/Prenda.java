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
	Criterio criterio;
	
	public Prenda(TipoDePrenda tipo, Categoria categoria, Material material, Color colorPrincipal, Color colorSecundario, Trama trama, float temperaturaMaximaAdecuada, Criterio criterio) {
		this.tipo = tipo;
		this.categoria = categoria;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
		this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
		this.criterio = criterio;
		
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
	
	public boolean esDeCriterio(Criterio criterio) {
		return this.criterio == criterio;
	}
	
}
