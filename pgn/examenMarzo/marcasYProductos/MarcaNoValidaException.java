package pgn.examenMarzo.marcasYProductos;

/**
 * Excepción que determina que la marca es inválida.
 * 
 * @author Isabel María Gómez Palomeque
 *
 */
public class MarcaNoValidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Método de la Excepción que determina que la marca es inválida y obtiene
	 * el mensaje de la excepción para ser lanzado.
	 * 
	 * @param arg0
	 *            Argumento obtenido por parámetro
	 */
	public MarcaNoValidaException(String arg0) {
		super(arg0);
	}
}
