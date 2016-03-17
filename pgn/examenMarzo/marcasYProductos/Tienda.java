package pgn.examenMarzo.marcasYProductos;

import java.util.ArrayList;


/**
 * Clase en la que se insertar�n los m�todos asociados al arrayList Tienda
 * 
 * @author Isabel Mar�a G�mez Palomeque
 */
public class Tienda {
	ArrayList<Producto> tienda = new ArrayList<Producto>();

	/**
	 * M�todo que a�ade al arrayList tienda un objeto del cual obtiene los
	 * par�metros de otra clase.
	 * 
	 * @param marca
	 *            Enumeraci�n obtenida desde otro m�todo.
	 * @param componente
	 *            Enumeraci�n obtenida desde otro m�todo.
	 * @param descriptor
	 *            Descripci�n obtenida desde otro m�todo.
	 * @throws DescripcionNoValidaException
	 * @throws ComponenteNoValidoException
	 * @throws PrecioNotValidException
	 * @throws MarcaNoValidaException
	 * @throws Exception
	 *             controla que el producto sea v�lido.
	 */
	void anadirProducto(Marca marca, Componente componente, double precio, String descriptor)
			throws MarcaNoValidaException, PrecioNotValidException, ComponenteNoValidoException,
			DescripcionNoValidaException {
		tienda.add(new Producto(marca, componente,precio,descriptor));
	}

	/**
	 * M�todo que elimina un producto en funci�n de su �ndice.
	 * 
	 * @param identificador
	 *            Identificador obtenido desde otro m�todo.
	 * @throws IdentificadorNoValidoException
	 *             controla que el identificador sea v�lido.
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
	 * M�todo que busca un producto en funci�n de su �ndice.
	 * 
	 * @param identificador
	 *            Identificador obtenido desde otro m�todo.
	 * @throws IdentificadorNoValidoException
	 *             controla que el identificador sea v�lido.
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
//		if(!tienda.contains(marca)) throw new MarcaNoValidaException("La marca no es v�lida o no existe.");
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
