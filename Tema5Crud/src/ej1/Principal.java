package ej1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		String nombreCompleto = "";
		double notaMedia;

		Scanner sc = new Scanner(System.in);

		do {
			menu();
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				break;

			case 2:

				System.out.println("Ingrese el nombre completo del alumno");
				nombreCompleto = sc.nextLine();

				System.out.println("Ingrese la nota promedio del alumno: ");
				notaMedia = sc.nextDouble();

				ArrayAlumnos.nuevoAlumno(new Alumno(nombreCompleto, notaMedia));

				break;
			}
		} while (opcion != 5);

	}

	public static void menu() {
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("   ALUMNOS/AS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

}
