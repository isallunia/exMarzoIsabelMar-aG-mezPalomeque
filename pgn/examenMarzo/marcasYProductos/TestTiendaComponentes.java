package pgn.examenMarzo.marcasYProductos;

import pgn.examenMarzo.utiles.Menu;
import pgn.examenMarzo.utiles.Teclado;

public class TestTiendaComponentes {
	static Menu menuPrincipal = new Menu("Tienda de Informática",
			new String[] { "Alta de un producto con valores por defecto", "Alta de un producto", "Baja de un producto", "Mostrar un producto(identificador)",
					"Mostrar Tienda", "Mostrar productos por marca", "Incrementar precio de producto inferior",
					"Salir" });

	static Menu menuMarca = new Menu("Marca del producto",
			new String[] { "SN(Sony)", "SG(Seagate)", "IN(Intel-Core)", "SM(Samsung)", "Salir" });

	static Menu menuComponente = new Menu("Tipo de Componente", new String[] { "DD(Discos Duros)", "PR(Procesadores)",
			"MR(Memoria Ram)", "FA(Fuentes de Alimentación)", "Salir" });

	static Tienda tienda = new Tienda();

	public static void main(String[] args) {
		int opcion;

		do {
			opcion = menuPrincipal.gestionar();
			switch (opcion) {
			case 1: //Alta de un producto con valores por defecto
				altaDeProductosPorDefecto();
				break;
			case 2: // Alta de un producto
				altaDeProducto();
				break;
			case 3: // Baja de un producto
				bajaDeProducto();
				break;
			case 4: // Mostrar un producto(identificador)
				mostrarProducto();
				break;
			case 5: // Mostrar Tienda
				mostrarTienda();
				break;
			case 6: // Mostrar productos por marca
				mostrarProductosPorMarca();
				break;

			case 7: // Incrementar precio de producto inferior
				incrementarPrecioProductoInferior();
				break;

			default:
				System.out.println("Has salido de la tienda.");
				return;
			}
		} while (opcion != menuPrincipal.numOpciones);
	}

	private static void altaDeProductosPorDefecto() {
		try {
			tienda.anadirProducto(Marca.SN, Componente.DD, 240.5, "El mejor del mundo mundial.");
			System.out.println("El producto se ha añadido con éxito.");
			tienda.anadirProducto(Marca.IN, Componente.PR, 175, "Intel-Core i5-4460 3,2Ghz Box.");
			System.out.println("El producto se ha añadido con éxito.");
			tienda.anadirProducto(Marca.SG, Componente.DD, 45.5, "Seagate Barracuda 7200.14 1TB SATA3.");
			System.out.println("El producto se ha añadido con éxito.");
			tienda.anadirProducto(Marca.SM, Componente.DD, 82, "Samsung 850 Evo SSD Series 250Gb SATA3.");
			System.out.println("El producto se ha añadido con éxito.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private static void incrementarPrecioProductoInferior() {
		//System.out.println(tienda.incrementarPrecio(Teclado.leerCadena("Introduce el identificador del producto: ")+"\nEl precio ha sido incrementado con éxito."));
	}

	private static void mostrarProductosPorMarca() {
		// TODO Auto-generated method stub
	}

	private static void mostrarTienda() {
		System.out.println(tienda);
	}

	private static void mostrarProducto() {
		try {
			System.out.println(tienda.buscarProducto(Teclado.leerCadena("Inserta el identificador del producto: ")));
		} catch (IdentificadorNoValidoException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void bajaDeProducto() {
		try {
			tienda.borrarProducto(Teclado.leerCadena("Inserte el identificador del producto: "));
			System.out.println("El producto se ha borrado con éxito.");
		} catch (IdentificadorNoValidoException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void altaDeProducto() {
		try {
			tienda.anadirProducto(menuMarcas(), menuComponente(),
					Teclado.leerDecimal("Inserte el precio del producto: "),
					Teclado.leerCadena("Inserte la descripción del producto: "));
			System.out.println("El producto se ha añadido con éxito.");
		} catch (MarcaNoValidaException e) {
			System.err.println(e.getMessage());
		} catch (PrecioNotValidException e) {
			System.err.println(e.getMessage());
		} catch (ComponenteNoValidoException e) {
			System.err.println(e.getMessage());
		} catch (DescripcionNoValidaException e) {
			System.err.println(e.getMessage());
		}

	}

	// Acceso a la red Capa de enlace capa física
	private static Componente menuComponente() {
		int opcion = menuComponente.gestionar();
		do {
			switch (opcion) {
			case 1: // DD(Discos Duros)
				System.out.println("Seleccionado Componente: DD(Discos Duros)");
				return Componente.DD;

			case 2: // PR(Procesadores)
				System.out.println("Seleccionado Componente: PR(Procesadores)");
				return Componente.PR;

			case 3: // MR(Memoria Ram)
				System.out.println("Seleccionado Componente: MR(Memoria Ram)");
				return Componente.MR;
			case 4: // FA(Fuentes de Alimentación)
				System.out.println("Seleccionado Componente: FA(Fuentes de Alimentación)");
				return Componente.FA;

			default: // Salir
				System.out.println("Has salido. No has seleccionado ningún componente.");
				return null;
			}
		} while (opcion != menuComponente.numOpciones);
	}

	private static Marca menuMarcas() {
		int opcion = menuMarca.gestionar();
		do {
			switch (opcion) {
			case 1: // SN(Sony)
				System.out.println("Seleccionada marca: SN(Sony)");
				return Marca.SN;

			case 2: // SG(Seagate)
				System.out.println("Seleccionada marca: SG(Seagate)");
				return Marca.SG;

			case 3: // IN(Intel-Core)
				System.out.println("Seleccionada marca: IN(Intel-Core)");
				return Marca.IN;
			case 4: // SM(Samsung)
				System.out.println("Seleccionada marca: SM(Samsung)");
				return Marca.SM;

			default: // Salir
				System.out.println("Has salido. No has seleccionado marca.");
				return null;
			}
		} while (opcion != menuMarca.numOpciones);
	}
}
