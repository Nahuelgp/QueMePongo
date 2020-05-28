package domain;


import java.util.Arrays;

public class Uniforme extends Atuendo{
	public Uniforme(Prenda parteInferior, Prenda parteSuperior, Prenda calzado) {
		super(Arrays.asList(parteInferior, parteSuperior, calzado));
	}
}
