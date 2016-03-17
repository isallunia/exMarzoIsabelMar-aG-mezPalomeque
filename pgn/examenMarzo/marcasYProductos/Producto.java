package pgn.examenMarzo.marcasYProductos;

import java.util.regex.Pattern;

public class Producto { // Tienda
	/**
	 * Contador est�tico del producto
	 */
	private static int contador = 1;

	/**
	 * Identificador que posee las enumeraciones y contador del producto.
	 */
	private String identificador;

	/**
	 * Marca del producto
	 */
	private Marca marca;

	/**
	 * Tipo de componente.
	 */
	private Componente componente;

	/**
	 * Precio del producto.
	 */
	private double precio;

	/**
	 * Descripci�n del producto.
	 */
	private String descriptor;

	/**
	 * Pattern que controla que el descriptor debe tener al menos 3 palabras en
	 * castellano.
	 */
	Pattern patternDescriptor = Pattern.compile("^([a-zA-Z������������\\d\\,\\.\\-]+\\s){2,}[a-zA-Z������������\\d\\.]+$");

	public Producto(Marca marca, Componente componente, double precio, String descriptor) throws MarcaNoValidaException,
			PrecioNotValidException, ComponenteNoValidoException, DescripcionNoValidaException {
		setMarca(marca);
		setPrecio(precio);
		setComponente(componente);
		setDescriptor(descriptor);
		setIdentificador();
	}

	public Producto(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * Devuelve el valor del identificador est�tico
	 * 
	 * @return identificador est�tico de la clase producto.
	 */
	String getIdentificador() {
		return identificador;
	}

	/**
	 * Asigna un incremento al identificador.
	 * 
	 * @param identificador
	 *            obtenido desde otro m�todo para ser asignado.
	 */
	private void setIdentificador() {
		// componente.getComponente();
		identificador = marca.toString() + "-" + componente.toString() + "-" + Producto.contador++;
	}

	/**
	 * Devuelve la enumeraci�n Marca.
	 * 
	 * @return the marca
	 */
	Marca getMarca() {
		return marca;
	}

	/**
	 * Asigna la enumeraci�n Marca.
	 * 
	 * @param marca
	 *            obtenida desde otro m�todo para ser asignada.
	 * @throws MarcaNoValidaException
	 */
	private void setMarca(Marca marca) throws MarcaNoValidaException {
		if (marca == null)
			throw new MarcaNoValidaException("Error. La marca es inv�lida o nula.");
		this.marca = marca;
	}

	void setPrecio(double precio) throws PrecioNotValidException {
		if (precio < 0)
			throw new PrecioNotValidException("Error. El precio no es v�lido, no puede ser menor a 0.");
		this.precio = precio;
	}

	double getPrecio() {
		return precio;
	}

	/**
	 * Devuelve la enumeraci�n Componente
	 * 
	 * @return the componente
	 */
	Componente getComponente() {
		return componente;
	}

	/**
	 * Asigna la enumeraci�n Componente
	 * 
	 * @param componente
	 *            obtenido desde otro m�todo para ser asignado.
	 */
	private void setComponente(Componente componente) throws ComponenteNoValidoException {
		if (componente == null)
			throw new ComponenteNoValidoException("Error. El componente es inv�lido o nulo.");
		this.componente = componente;
	}

	/**
	 * Devuelve la descripci�n del producto.
	 * 
	 * @return the descriptor
	 */
	String getDescriptor() {
		return descriptor;
	}

	/**
	 * Asigna la descripci�n del producto.
	 * 
	 * @param descriptor
	 *            obtenido desde otro m�todo para ser asignado.
	 * 
	 * @throws DescripcionNoValidaException
	 *             Excepci�n que salta si el pattern no es correcto.
	 */
	private void setDescriptor(String descriptor) throws DescripcionNoValidaException {
		if (!patternDescriptor.matcher(descriptor).matches())
			throw new DescripcionNoValidaException(
					"Error. La descripci�n no tiene un formato v�lido. M�nimo 3 palabras");
		this.descriptor = descriptor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", marca=" + marca + ", componente=" + componente
				+ ", precio=" + precio + ", descriptor=" + descriptor + "]";
	}
}
