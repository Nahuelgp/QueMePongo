package exceptions;

public class CategoriaInvalidaException extends RuntimeException{
	public CategoriaInvalidaException(String mensajeError) {
		super(mensajeError);
	}
}
