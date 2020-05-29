package domain;

public class SastreJohnson extends Sastre {
	@Override
	Prenda fabricarParteSuperior() {
        borrador = new Borrador(TipoDePrenda.CAMISA);
        borrador.setColorPrincipal(Color.BLANCO);
        borrador.setMaterial(Material.ALGODON);
        return borrador.crearPrenda();
	}
	
	@Override
	Prenda fabricarParteInferior() {
        borrador = new Borrador(TipoDePrenda.PANTALON);
        borrador.setColorPrincipal(Color.GRIS);
        borrador.setMaterial(Material.DE_VESTIR);
        return borrador.crearPrenda();
	}
	
	@Override
	Prenda fabricarCalzado() {
        borrador = new Borrador(TipoDePrenda.ZAPATILLAS);
        borrador.setColorPrincipal(Color.BLANCO);
        borrador.setMaterial(Material.CUERO);
        return borrador.crearPrenda();
	}
}
