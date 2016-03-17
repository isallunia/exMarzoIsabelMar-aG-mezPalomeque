package pgn.examenMarzo.marcasYProductos;

/**
 * Es una enumeraci�n del producto que poseer� las marcas Sony(SN), Seagate(SG),
 * Intel-Core(IN) e Samsung(SM).
 * 
 * @author Isabel Mar�a G�mez Palomeque
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
	 * Es la cadena que especifica cu�l es la marca de la enumeraci�n asociada a esas siglas.
	 */
	String marca;
	
	/**
	 * Constructor de la cadena componente previamente declarada.
	 * 
	 * @param marca cadena que especifica el valor de la enumeraci�n obtenida desde la clase.
	 */
	Marca(String marca){
		setMarca(marca);
	}

	/**
	 * Realiza la asignaci�n de la cadena marca obtenida desde la clase Marca.
	 * 
	 * @param marca cadena que especifica el valor de la enumeraci�n obtenida desde la clase.
	 */
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Devuelve la cadena marca obtenida desde la clase Marca.
	 * 
	 * @return marca cadena que especifica el valor de la enumeraci�n obtenida desde la clase.
	 */
	String getMarca(){
		return marca;
	}
	
	/**
	 * M�todo que obtiene las marcas de componentes de la enumeraci�n.
	 * 
	 * @return marcas devuelve la cadena de marcas de la enumeraci�n
	 */
	String[] elegirMarca(){
		String[] marcas = new String[marca.length()];
		for (Marca marca : values()) {
			marcas = new String[]{marca.name()};
		}
		return marcas;
	}
}
