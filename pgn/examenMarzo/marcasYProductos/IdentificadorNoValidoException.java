/**
 * 
 */
package pgn.examenMarzo.marcasYProductos;

/**
 * Excepci�n que determina que el identificador no es inv�lido.
 * 
 * @author Isabel Mar�a G�mez Palomeque
 *
 */
public class IdentificadorNoValidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * M�todo de la Excepci�n que determina que el identificador es inv�lido y obtiene
	 * el mensaje de la excepci�n para ser lanzado.
	 * 
	 * @param message Mensaje o argumento que se mostrar� en la excepci�n.
	 */
	public IdentificadorNoValidoException(String message) {
		super(message);
	}
}
