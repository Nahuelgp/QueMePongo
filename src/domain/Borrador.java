package domain;

import exceptions.CategoriaInvalidaException;
import exceptions.PrendaInvalidaException;

//Builder de prendas
//Confio en que el usuario no va a crear una prenda si no la termino, 
//aunque si ocurriera el caso que lo haga igual, la prenda no se va a poder crear.

public class Borrador {
	TipoDePrenda tipo;
	Categoria categoria;
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	Trama trama;
	float temperaturaMaximaAdecuada;
	Criterio criterio;
	
	public Borrador(TipoDePrenda tipo) {
		this.tipo = tipo;
	}
	
	public void setCategoria(Categoria categoria) {
		validarCategoriaDelTipo(tipo, categoria);
		this.categoria = categoria;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public void setColorPrincipal(Color colorPrincipal) {
		this.colorPrincipal = colorPrincipal;
	}
	
	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
	public void setTrama(Trama trama) {
		this.trama = trama;
	}
	
	public void validarCategoriaDelTipo(TipoDePrenda tipo, Categoria categoria) {
		if (!tipo.admiteCategoria(categoria)) {
			throw new CategoriaInvalidaException("El tipo de la prenda que se quiso hacer no coincide con la categoria dada");
		}
	}
	
	public void validarPrenda(TipoDePrenda tipo, Categoria categoria, Material material, Color colorPrincipal) {
		if (tipo == null || categoria == null || material == null || colorPrincipal == null) {
			throw new PrendaInvalidaException("La prenda que se quiso hacer es invalida");
		}
	}
	
	public Prenda crearPrenda() {
		validarPrenda(tipo, categoria, material, colorPrincipal);
		return new Prenda(tipo, categoria, material, colorPrincipal, colorSecundario, trama, temperaturaMaximaAdecuada, criterio);
	}
	
}
