package ej1;

import java.util.Objects;

public class Alumno {
	/**
	 * Atributo alumno que recoge el nombre de los alumnos
	 */
	private String alumno = "";
	/**
	 * Atributo notaMedia que recoge la nota media de cada alumno
	 */
	private double notaMedia;
	
	/**
	 * Constructor sin parámetros
	 */
	public Alumno() {
		
	}
	/**
	 * Contructor con parámetros para instanciar un nuevo objeto de la clase Alumno
	 * @param alumno nombre del alumno
	 * @param notaMedia nota promedio del alumno
	 */
	public Alumno (String alumno, double notaMedia) {
		
		if(!alumno.equals("") && alumno !=null) {
		this.alumno = alumno;
		}
		
		if(notaMedia>0 && notaMedia<10) {
		this.notaMedia = notaMedia;
		}
	}
	
	public String getAlumno() {
		return this.alumno;
	}
	
	public double getNotaMedia() {
		return this.notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		if(notaMedia>0 && notaMedia<10) {
			this.notaMedia = notaMedia;
			}
		
		
	}
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += " -----------------------------------_\n";
		cadena += "| Alumno: " + this.alumno +        "|"+"\n";
		cadena += "| Nota Media: " + this.notaMedia + "|"+"\\n";
		cadena += " -----------------------------------_\n";
		
		return cadena;
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean isValid=false;
		if (this.alumno.equals(alumno)) {
			isValid = true;
	}
		return isValid;
	}
	
	
	
	
	
	
	

}
