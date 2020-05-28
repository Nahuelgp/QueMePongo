package domain;

public enum TipoDePrenda {
	ZAPATO(Categoria.CALZADO),
	REMERA(Categoria.PARTE_SUPERIOR),
	PANTALON(Categoria.PARTE_INFERIOR),
	ANTEOJOS(Categoria.ACCESORIO),
	GORRA(Categoria.ACCESORIO);
	
	private Categoria categoria;
	private TipoDePrenda(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public boolean admiteCategoria(Categoria categoria) {
		return this.categoria == categoria;
	}
}
