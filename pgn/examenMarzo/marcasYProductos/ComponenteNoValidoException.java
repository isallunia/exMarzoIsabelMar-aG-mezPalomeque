package pgn.examenMarzo.marcasYProductos;
/**
 * Excepción que determina que el componente es inválido.
 * 
 * @author Isabel María Gómez Palomeque
 *
 */
public class ComponenteNoValidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Método de la Excepción que determina que el componente es inválido y obtiene
	 * el mensaje de la excepción para ser lanzado.
	 * 
	 * @param message Mensaje o argumento que se mostrará en la excepción.
	 */
	public ComponenteNoValidoException(String message) {
		super(message);
	}

}
