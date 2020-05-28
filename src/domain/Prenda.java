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
		validarPrenda(tipo, categoria, material, colorPrincipal);
		validarCategoriaDelTipo(tipo, categoria);
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
	
	public void validarPrenda(TipoDePrenda tipo, Categoria categoria, Material material, Color colorPrincipal) {
		if (tipo == null || categoria == null || material == null || colorPrincipal == null) {
			throw new PrendaInvalidaException("La prenda que se quiso hacer es invalida");
		}
	}
	
	public void validarCategoriaDelTipo(TipoDePrenda tipo, Categoria categoria) {
		if (!tipo.admiteCategoria(categoria)) {
			throw new CategoriaInvalidaException("El tipo de la prenda que se quiso hacer no coincide con la categoria dada");
		}
	}

	public boolean esAptaParaLaTemperaturaActual() {
		return temperaturaMaximaAdecuada <= Clima.instance().obtenerClimaActual();
	}
	
}
