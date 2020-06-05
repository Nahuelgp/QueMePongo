package domain;

public class Quitar implements Propuesta {
	Prenda prenda;
	
	public void aplicarEn(Usuario usuario) {
		usuario.quitarPrendaAlGuardarropas(prenda);
	}
	
	public void deshacerlaEn(Usuario usuario) {
		usuario.agregarPrendaAlGuardarropas(prenda);
	}
}
