package exceptions;

public class PrendaInvalidaException extends RuntimeException{
	public PrendaInvalidaException(String mensajeError) {
		super(mensajeError);
	}
}
