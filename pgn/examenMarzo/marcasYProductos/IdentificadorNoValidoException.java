/**
 * 
 */
package pgn.examenMarzo.marcasYProductos;

/**
 * Excepción que determina que el identificador no es inválido.
 * 
 * @author Isabel María Gómez Palomeque
 *
 */
public class IdentificadorNoValidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Método de la Excepción que determina que el identificador es inválido y obtiene
	 * el mensaje de la excepción para ser lanzado.
	 * 
	 * @param message Mensaje o argumento que se mostrará en la excepción.
	 */
	public IdentificadorNoValidoException(String message) {
		super(message);
	}
}
