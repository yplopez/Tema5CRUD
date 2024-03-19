package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		Scanner scan = new Scanner(System.in);
		
		while (opc != 4) {
			mostrarMenu();
			opc = scan.nextInt();
			
			ejecutarAccion(opc, scan);
	
		}

	}
	
	private static void mostrarMenu() {
		System.out.println("1. Ver listado de pizzas");
		System.out.println("2. Hacer pedido");
		System.out.println("3. Servir pizza");
		System.out.println("4. Salir");
		System.out.print("Introduce una opcion--> ");
	}
	
	private static void ejecutarAccion(int opc, Scanner scan) {
		scan.nextLine();
		
		switch(opc) {
			case 1:
				ArrayPizzas.mostrarPizzas();
				break;
			case 2:
				System.out.print("Introduce el tamaño de la pizza--> ");
				String tam = scan.nextLine();
				
				System.out.print("Introduce el tipo de la pizza--> ");
				String tipo = scan.nextLine();
				
				ArrayPizzas.addPizza(new Pizza(tam, tipo));
				
				break;
			case 3:
				System.out.print("Introduce el codigo de la pizza--> ");
				int cod = scan.nextInt();
				
				ArrayPizzas.cambiarEstado(cod);
				break;
			case 4:
				System.out.println("Hasta la viste mi filipine");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
		}
		
	}

}
