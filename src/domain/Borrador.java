package domain;

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
	
	public void setTipo(TipoDePrenda tipo) {
		this.tipo = tipo;
	}
	
	public void setCategoria(Categoria categoria) {
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
	
	public Prenda crearPrenda() {
		return new Prenda(tipo, categoria, material, colorPrincipal, colorSecundario, trama, temperaturaMaximaAdecuada);
	}
	
}
