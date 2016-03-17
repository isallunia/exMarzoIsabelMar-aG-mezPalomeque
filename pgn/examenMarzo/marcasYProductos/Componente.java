package pgn.examenMarzo.marcasYProductos;
/**
 * Es una enumeración de los componentes que poseerá: DD(Discos Duros), PR(Procesadores),
 * MR(Memoria Ram) y FA(Fuentes de Alimentación).
 * 
 * @author Isabel María Gómez Palomeque
 */
public enum Componente {
	/**
	 * Disco Duro o DD componente de la tienda.
	 */
	DD("Discos Duros"),
	/**
	 * Procesador o PR componente de la tienda.
	 */
	PR("Procesadores"),
	/**
	 * Memoria Ram o MR componente de la tienda.
	 */
	MR("Memoria Ram"),
	/**
	 * Fuente de Alimentación o FA componente de la tienda.
	 */
	FA("Fuentes de alimentacion");
	
	/**
	 * Es la cadena que especifica cuál es el componente de la enumeración asociado a esas siglas.
	 */
	String componente;
	
	/**
	 * Constructor de la cadena componente previamente declarada.
	 * 
	 * @param componente cadena que especifica el valor de la enumeración obtenida desde la clase.
	 */
	Componente(String componente){
		setComponente(componente);
	}

	/**
	 * Realiza la asignación de la cadena componente obtenida desde la clase Componente.
	 * 
	 * @param componente cadena que especifica el valor de la enumeración obtenida desde la clase.
	 */
	private void setComponente(String componente) {
		this.componente = componente;
	}
	
	/**
	 * Devuelve la cadena componente obtenida desde la clase Componente.
	 * 
	 * @return componente cadena que especifica el valor de la enumeración obtenida desde la clase.
	 */
	String getComponente(){
		return componente;
	}
	
	/**
	 * Método que obtiene la cadena de componentes de la enumeración.
	 * 
	 * @return componentes devuelve la cadena de componentes de la enumeración
	 */
	String[] elegirComponente(){
		String[] componentes = new String[componente.length()];
		for (Componente componente : values()) {
			componentes = new String[]{componente.name()};
		}
		return componentes;
	}
}
