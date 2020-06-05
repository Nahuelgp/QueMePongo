package domain;

public class Agregar implements Propuesta {
	Prenda prenda;
	
	public void aplicarEn(Usuario usuario) {
		usuario.agregarPrendaAlGuardarropas(prenda);
	}
	
	public void deshacerlaEn(Usuario usuario) {
		usuario.quitarPrendaAlGuardarropas(prenda);
	}
}
