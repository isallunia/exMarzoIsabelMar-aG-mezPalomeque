package pgn.examenMarzo.marcasYProductos;

/**
 * Excepci�n que determina que la marca es inv�lida.
 * 
 * @author Isabel Mar�a G�mez Palomeque
 *
 */
public class MarcaNoValidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * M�todo de la Excepci�n que determina que la marca es inv�lida y obtiene
	 * el mensaje de la excepci�n para ser lanzado.
	 * 
	 * @param arg0
	 *            Argumento obtenido por par�metro
	 */
	public MarcaNoValidaException(String arg0) {
		super(arg0);
	}
}
