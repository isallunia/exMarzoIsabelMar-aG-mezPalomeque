package pgn.examenMarzo.marcasYProductos;

/**
 * Es una enumeración del producto que poseerá las marcas Sony(SN), Seagate(SG),
 * Intel-Core(IN) e Samsung(SM).
 * 
 * @author Isabel María Gómez Palomeque
 *
 */
public enum Marca {
	/**
	 * Marca SN o Sony.
	 */
	SN("Sony"),
	/**
	 * Marca SG o Seagate.
	 */
	SG("Seagate"),
	/**
	 * Marca IN o Intel-Core.
	 */
	IN("Intel-Core"),
	/**
	 * Marca SM o Samsung.
	 */
	SM("Samsung");

	/**
	 * Es la cadena que especifica cuál es la marca de la enumeración asociada a esas siglas.
	 */
	String marca;
	
	/**
	 * Constructor de la cadena componente previamente declarada.
	 * 
	 * @param marca cadena que especifica el valor de la enumeración obtenida desde la clase.
	 */
	Marca(String marca){
		setMarca(marca);
	}

	/**
	 * Realiza la asignación de la cadena marca obtenida desde la clase Marca.
	 * 
	 * @param marca cadena que especifica el valor de la enumeración obtenida desde la clase.
	 */
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Devuelve la cadena marca obtenida desde la clase Marca.
	 * 
	 * @return marca cadena que especifica el valor de la enumeración obtenida desde la clase.
	 */
	String getMarca(){
		return marca;
	}
	
	/**
	 * Método que obtiene las marcas de componentes de la enumeración.
	 * 
	 * @return marcas devuelve la cadena de marcas de la enumeración
	 */
	String[] elegirMarca(){
		String[] marcas = new String[marca.length()];
		for (Marca marca : values()) {
			marcas = new String[]{marca.name()};
		}
		return marcas;
	}
}
