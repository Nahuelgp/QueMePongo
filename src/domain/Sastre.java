package domain;

abstract class Sastre {
	Borrador borrador;
	
	public Uniforme fabricarUniforme() {
		return new Uniforme(this.fabricarParteInferior(), this.fabricarParteSuperior(), this.fabricarCalzado());
	}
	
	abstract Prenda fabricarParteInferior();
	abstract Prenda fabricarParteSuperior();
	abstract Prenda fabricarCalzado();
}
