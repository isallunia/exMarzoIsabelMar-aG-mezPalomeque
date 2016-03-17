/**
 * 
 */
package pgn.examenMarzo.marcasYProductos;

/**
 * Excepción que determina que la descripción no es inválida.
 * 
 * @author Isabel María Gómez Palomeque
 */
public class DescripcionNoValidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Método de la Excepción que determina que la descripción es inválida y obtiene
	 * el mensaje de la excepción para ser lanzado.
	 * 
	 * @param message Mensaje o argumento que se mostrará en la excepción.
	 */
	public DescripcionNoValidaException(String message) {
		super(message);
	}
}
