package domain;

public enum TipoDePrenda {
	ZAPATOS(Categoria.CALZADO),
	REMERA(Categoria.PARTE_SUPERIOR),
	CAMISA(Categoria.PARTE_SUPERIOR),
	PANTALON(Categoria.PARTE_INFERIOR),
	ANTEOJOS(Categoria.ACCESORIO),
	GORRA(Categoria.ACCESORIO),
	ZAPATILLAS(Categoria.CALZADO),
	CHOMBA(Categoria.PARTE_SUPERIOR);
	
	private Categoria categoria;
	private TipoDePrenda(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public boolean admiteCategoria(Categoria categoria) {
		return this.categoria == categoria;
	}
}
