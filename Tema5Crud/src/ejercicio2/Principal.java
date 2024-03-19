package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opc = 1;
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		Articulo art;
		boolean anyadido;

		Scanner sc = new Scanner(System.in);

		System.out.println("BIENVENIDO A GESTISIMAL");

		while (opc > 0 && opc < 8) {
			menu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				System.out.println("LISTADO DE ARTÍCULOS:");
				for (Articulo articulo : Gestisimal.articulos) {
					if (articulo != null) {
						System.out.println(articulo.toString());
					}
				}
				break;
			case 2:
				System.out.println("Introduzca el código");
				codigo = sc.nextInt();
				sc.nextLine();

				System.out.println("Introduzca la descripción");
				descripcion = sc.nextLine();

				System.out.println("Introduzca el precio compra");
				precioCompra = sc.nextDouble();
				sc.nextLine();

				System.out.println("Introduzca el precio venta");
				precioVenta = sc.nextDouble();
				sc.nextLine();

				System.out.println("Introduzca el stock");
				stock = sc.nextInt();
				sc.nextLine();

				art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
				anyadido = Gestisimal.alta(art);
				if (anyadido) {
					System.out.println("Artículo añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir el artículo");
				}
				break;
			case 3:
				System.out.println("Introduzca el código del artículo que desea eliminar:");
				int codigoBaja = sc.nextInt();
				sc.nextLine();

				boolean eliminado = false;
				for (int i = 0; i < Gestisimal.articulos.length; i++) {
					if (Gestisimal.articulos[i] != null && Gestisimal.articulos[i].getCodigo() == codigoBaja) {
						Gestisimal.articulos[i] = null;
						eliminado = true;
						System.out.println("Artículo eliminado correctamente");
						break;
					}
				}
				if (!eliminado) {
					System.out.println("No se encontró ningún artículo con el código especificado");
				}
				break;
			case 4:
				System.out.println("Introduzca el código del artículo que desea modificar:");
				int codigoModificar = sc.nextInt();
				sc.nextLine();

				boolean encontrado = false;
				for (int i = 0; i < Gestisimal.articulos.length; i++) {
					if (Gestisimal.articulos[i] != null && Gestisimal.articulos[i].getCodigo() == codigoModificar) {
						encontrado = true;

						System.out.println("Introduzca la nueva descripción:");
						String nuevaDescripcion = sc.nextLine();
						Gestisimal.articulos[i].setDescripcion(nuevaDescripcion);

						System.out.println("Introduzca el nuevo precio de compra:");
						double nuevoPrecioCompra = sc.nextDouble();
						sc.nextLine();
						Gestisimal.articulos[i].setPrecioCompra(nuevoPrecioCompra);

						System.out.println("Introduzca el nuevo precio de venta:");
						double nuevoPrecioVenta = sc.nextDouble();
						sc.nextLine();
						Gestisimal.articulos[i].setPrecioVenta(nuevoPrecioVenta);

						System.out.println("Introduzca el nuevo stock:");
						int nuevoStock = sc.nextInt();
						sc.nextLine();
						Gestisimal.articulos[i].setStock(nuevoStock);

						System.out.println("Artículo modificado correctamente");
						break;
					}
				}
				if (!encontrado) {
					System.out.println("No se encontró ningún artículo con el código especificado");
				}
				break;
			case 5:
				System.out.println("Introduzca el código del artículo para la entrada de mercancía:");
				int codigoEntrada = sc.nextInt();
				sc.nextLine();

				boolean encontradoEntrada = false;
				for (int i = 0; i < Gestisimal.articulos.length; i++) {
					if (Gestisimal.articulos[i] != null && Gestisimal.articulos[i].getCodigo() == codigoEntrada) {
						encontradoEntrada = true;

						System.out.println("Introduzca la cantidad de mercancía que entra:");
						int cantidadEntrada = sc.nextInt();
						sc.nextLine();

						int stockActual = Gestisimal.articulos[i].getStock();
						Gestisimal.articulos[i].setStock(stockActual + cantidadEntrada);

						System.out.println("Entrada de mercancía realizada correctamente");
						break;
					}
				}
				if (!encontradoEntrada) {
					System.out.println("No se encontró ningún artículo con el código especificado");
				}
				break;
			case 6:
				System.out.println("Introduzca el código del artículo para la salida de mercancía:");
				int codigoSalida = sc.nextInt();
				sc.nextLine();

				boolean encontradoSalida = false;
				for (int i = 0; i < Gestisimal.articulos.length; i++) {
					if (Gestisimal.articulos[i] != null && Gestisimal.articulos[i].getCodigo() == codigoSalida) {
						encontradoSalida = true;

						System.out.println("Introduzca la cantidad de mercancía que sale:");
						int cantidadSalida = sc.nextInt();
						sc.nextLine();

						int stockActual = Gestisimal.articulos[i].getStock();
						if (stockActual >= cantidadSalida) {
							Gestisimal.articulos[i].setStock(stockActual - cantidadSalida);
							System.out.println("Salida de mercancía realizada correctamente");
						} else {
							System.out
									.println("No hay suficiente stock disponible para realizar la salida de mercancía");
						}
						break;
					}
				}
				if (!encontradoSalida) {
					System.out.println("No se encontró ningún artículo con el código especificado");
				}
				break;
			case 7:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
				break;
			}

		}
	}

	public static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificar");
		System.out.println("5. Entrada mercancía");
		System.out.println("6. Salida mercancía");
		System.out.println("7. Salir");
		System.out.println("Seleccione una opción");
	}
}