package domain;

public class SastreSanJuan extends Sastre{
	
	@Override
	Prenda fabricarParteSuperior() {
        borrador = new Borrador(TipoDePrenda.REMERA);
        borrador.setColorPrincipal(Color.VERDE);
        borrador.setMaterial(Material.PIQUE);
        return borrador.crearPrenda();
	}
	
	@Override
	Prenda fabricarParteInferior() {
        borrador = new Borrador(TipoDePrenda.PANTALON);
        borrador.setColorPrincipal(Color.GRIS);
        borrador.setMaterial(Material.ACETATO);
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
