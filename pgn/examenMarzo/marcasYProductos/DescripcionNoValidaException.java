/**
 * 
 */
package pgn.examenMarzo.marcasYProductos;

/**
 * Excepci�n que determina que la descripci�n no es inv�lida.
 * 
 * @author Isabel Mar�a G�mez Palomeque
 */
public class DescripcionNoValidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * M�todo de la Excepci�n que determina que la descripci�n es inv�lida y obtiene
	 * el mensaje de la excepci�n para ser lanzado.
	 * 
	 * @param message Mensaje o argumento que se mostrar� en la excepci�n.
	 */
	public DescripcionNoValidaException(String message) {
		super(message);
	}
}
