package ejercicio3;

public class Pizza {

	private static int contCod = 1;
	
	private int codigo;

	private String tamanio;

	private String tipo;

	private String estado;

	public Pizza() {
		this.codigo = contCod;
		contCod++;
		this.estado = "Pedida";
	}

	public Pizza(String tamanio, String tipo) {

		this.codigo = contCod;
		contCod++;

		if (tamanio.equalsIgnoreCase("mediana") || tamanio.equalsIgnoreCase("pequeña")) {
			this.tamanio = tamanio;
		}

		if (tipo.equalsIgnoreCase("margarita") || tipo.equalsIgnoreCase("cuatroquesos") ||tipo.equalsIgnoreCase("funghi") ) {
			this.tipo = tipo;
		}

		this.estado = "Pedida";

	}

	public int getCodigo() {
		return codigo;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		if (tamanio.equalsIgnoreCase("mediana") || tamanio.equalsIgnoreCase("pequeña")) {
			this.tamanio = tamanio;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo.equalsIgnoreCase("margarita") || tipo.equalsIgnoreCase("cuatroquesos") ||tipo.equalsIgnoreCase("funghi") ) {
			this.tipo = tipo;
		}
	}

	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		if (estado.equalsIgnoreCase("pedida") || estado.equalsIgnoreCase("servida")) {
			if (this.estado.equalsIgnoreCase("servida") && estado.equalsIgnoreCase("servida")) {
				System.out.println("La pizza ya está servida");
			} else {
				this.estado = estado;
				System.out.println("Se ha cambiado el estado a " + estado);
			}
			
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Código--> " + this.codigo + "\n Tamaño--> " + this.tamanio + "\n Tipo--> " + this.tipo + "\n Estado--> " + this.estado);
		System.out.println();
	}

}
