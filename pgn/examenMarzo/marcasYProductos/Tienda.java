package pgn.examenMarzo.marcasYProductos;

import java.util.ArrayList;


/**
 * Clase en la que se insertarán los métodos asociados al arrayList Tienda
 * 
 * @author Isabel María Gómez Palomeque
 */
public class Tienda {
	ArrayList<Producto> tienda = new ArrayList<Producto>();

	/**
	 * Método que añade al arrayList tienda un objeto del cual obtiene los
	 * parámetros de otra clase.
	 * 
	 * @param marca
	 *            Enumeración obtenida desde otro método.
	 * @param componente
	 *            Enumeración obtenida desde otro método.
	 * @param descriptor
	 *            Descripción obtenida desde otro método.
	 * @throws DescripcionNoValidaException
	 * @throws ComponenteNoValidoException
	 * @throws PrecioNotValidException
	 * @throws MarcaNoValidaException
	 * @throws Exception
	 *             controla que el producto sea válido.
	 */
	void anadirProducto(Marca marca, Componente componente, double precio, String descriptor)
			throws MarcaNoValidaException, PrecioNotValidException, ComponenteNoValidoException,
			DescripcionNoValidaException {
		tienda.add(new Producto(marca, componente,precio,descriptor));
	}

	/**
	 * Método que elimina un producto en función de su índice.
	 * 
	 * @param identificador
	 *            Identificador obtenido desde otro método.
	 * @throws IdentificadorNoValidoException
	 *             controla que el identificador sea válido.
	 */
	void borrarProducto(String identificador) throws IdentificadorNoValidoException {
		try {
			tienda.remove(buscarProducto(identificador));
		} catch (IndexOutOfBoundsException e) {
			throw new IdentificadorNoValidoException(
					"El identificador no existe.");
		}
	}
	
	/**
	 * Método que busca un producto en función de su índice.
	 * 
	 * @param identificador
	 *            Identificador obtenido desde otro método.
	 * @throws IdentificadorNoValidoException
	 *             controla que el identificador sea válido.
	 */
	Producto buscarProducto(String identificador) throws IdentificadorNoValidoException{
		try{
			return tienda.get(tienda.indexOf(new Producto(identificador)));
		} catch (IndexOutOfBoundsException e) {
			throw new IdentificadorNoValidoException(
					"El identifcador no puede ser menor que 0, ni que se salga de rango");
		}
	}
	
//	Producto buscarProductoMarca(Marca marca) throws MarcaNoValidaException{
//		if(!tienda.contains(marca)) throw new MarcaNoValidaException("La marca no es válida o no existe.");
//		tienda.contains(marca.compareTo(marca));
//		return null;
//	}
	
//	Producto incrementarPrecio(String identificador){
//		try {
//			Producto producto = buscarProducto(identificador);
//			if(producto.getPrecio()<100)
//					producto.setPrecio((producto.getPrecio()+(producto.getPrecio()*0.10)));
//					return producto;
//		} catch (IdentificadorNoValidoException e) {
//			System.err.println("El identificador no existe.");
//		} catch (PrecioNotValidException e) {
//			System.err.println("El precio no debe ser inferior a 0.");
//		}
//		return null;
//	}

	@Override
	public String toString() {
		return "Tienda [tienda=" + tienda + "]";
	}
	
}
