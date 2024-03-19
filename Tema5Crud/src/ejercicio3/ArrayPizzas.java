package ejercicio3;

public class ArrayPizzas {
	private static Pizza[] pizzas = new Pizza[50];
	private static int cont = 0;
	
	public static void addPizza(Pizza pizza) {
		if (cont > 49) {
			System.out.println("No se pueden añadir más pizzas");
		} else {
			pizzas[cont] = pizza;
			cont++;
		}
	}
	
	public static void mostrarPizzas() {
		for (Pizza p : pizzas) {
			if (p != null) {
				p.mostrarInfo();
			} 
		}
	}
	
	public static void cambiarEstado(int codigo) {
		Pizza pizza = null;
		
		int i = 0;
		boolean enc = false;
		
		while (i < pizzas.length && !enc) {
			if (pizzas[i] != null && pizzas[i].getCodigo() == codigo) {
				pizza = pizzas[i];
				enc = true;
			}
			i++;
		}
		
		/*
		for (Pizza p : pizzas) {
			if (p != null && p.getCodigo() == codigo) {
				pizza = p;
			}
		}*/
		
		if (pizza != null) {
			pizza.setEstado("Servida");
		} else {
			System.out.println("Pizza no encontrada");
		}
		
	}
}
