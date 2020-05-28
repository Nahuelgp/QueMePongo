package exceptions;

public class AtuendoInvalidoException extends RuntimeException {
	public AtuendoInvalidoException(String mensajeError) {
		super(mensajeError);
	}
}
