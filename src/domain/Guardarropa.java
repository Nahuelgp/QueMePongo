package domain;

import java.util.*;

public class Guardarropa {
	Criterio criterio; 
	List<Prenda> prendas;
	
	public Guardarropa(Criterio criterio) {
		this.criterio = criterio;
	}
	
	public void agregarPrenda(Prenda prenda) {
		if(puedeAgregar(prenda))
			prendas.add(prenda);
	}
	
	public void quitarPrenda(Prenda prenda) {
		prendas.remove(prenda);
	}

	public boolean puedeAgregar(Prenda prenda) {
		return prenda.esDeCriterio(criterio);
	}

	public Criterio getCriterio() {
		return criterio;
	}	
}
