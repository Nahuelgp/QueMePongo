package domain;

import java.util.*;

public class Usuario {
	List<Guardarropa> guardarropas;
	List<Guardarropa> guardarropasCompartidos;
	List<Propuesta> propuestas;
	List<Propuesta> propuestasAceptadas;
	
	
	public List<Propuesta> getPropuestas() {
		return propuestas;
	}

	public Usuario(List<Guardarropa> guardarropas) {
		this.guardarropas = guardarropas;
	}
	
	public void agregarGuardarropa(Guardarropa guardarropa) {
		guardarropas.add(guardarropa);
	}
	
	public void compartirGuardarropa(Guardarropa guardarropa, Usuario otroUsuario) {
		this.agregarGuardarropa(guardarropa);
		otroUsuario.agregarGuardarropaCompartido(guardarropa);
	}

	private void agregarGuardarropaCompartido(Guardarropa guardarropa) {
		guardarropasCompartidos.add(guardarropa);
	}

	public void agregarPrendaAlGuardarropas(Prenda prenda) {
		guardarropas.stream().filter(guardarropa -> prenda.esDeCriterio(guardarropa.getCriterio())).findAny().agregarPrenda(prenda);
		//Aca se agrega al guardarropas la prenda que tiene el mismo criterio
		//Solo se agrega del guardarropas no compartido NO SE PUEDE QUITAR DEL COMPARTIDO PORQUE NO ES EL DUEÑO
	}
	
	public void quitarPrendaAlGuardarropas(Prenda prenda) {
		guardarropas.stream().filter(guardarropa -> prenda.esDeCriterio(guardarropa.getCriterio())).findAny().quitarPrenda(prenda);
		//Aca se quita al guardarropas la prenda que tiene el mismo criterio
		//Solo se quita del guardarropas no compartido NO SE PUEDE QUITAR DEL COMPARTIDO PORQUE NO ES EL DUEÑO
	}
	
	public void aceptarPropuesta(Propuesta unaPropuesta) {
		encontrarPropuesta(propuestas, unaPropuesta).aplicarEn(this);
		propuestas.remove(unaPropuesta);
		propuestasAceptadas.add(unaPropuesta);
	}
	
	public void rechazarPropuesta(Propuesta unaPropuesta) {
		propuestas.remove(unaPropuesta);
	}
	
	public void deshacerPropuesta(Propuesta propuesta) {
		encontrarPropuesta(propuestasAceptadas, propuesta).deshacerlaEn(this);
	}
	
	public Propuesta encontrarPropuesta(List<Propuesta> propuestas, Propuesta propuesta) {
		//Busca la propuesta especificada en la lista y si no la encuentra tiraria excepcion (esto esta de más)
		return propuesta;
	}
}
