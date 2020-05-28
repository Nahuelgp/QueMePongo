package domain;

import exceptions.*;
import java.util.Arrays;
import java.util.List;

public class Atuendo {
	List<Prenda> prendas;
	
	public Atuendo(List<Prenda> prendas) {
		validarAtuendo(prendas);
		this.prendas = prendas;
	}
	
	public boolean tieneCategoriasNecesarias(List<Prenda> prendas) {
		List<Categoria> categoriasNecesarias = Arrays.asList(Categoria.CALZADO, Categoria.PARTE_INFERIOR, Categoria.PARTE_SUPERIOR);
		return categoriasNecesarias.stream().allMatch(categoriaNecesaria -> prendas.stream().anyMatch(prenda -> prenda.tieneCategoria(categoriaNecesaria)));
	}
	
	public void validarAtuendo(List<Prenda> prendas) {
		if (!tieneCategoriasNecesarias(prendas)) {
			throw new AtuendoInvalidoException("El Atuendo no tiene logica");
		}
	}
}
