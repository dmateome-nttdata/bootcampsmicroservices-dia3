package com.example.demo;

public class Saludo {

	private String idioma;

	public Saludo(String idioma) {
		super();
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensaje="";
		
		switch (idioma) {
		case "Castellano":
			mensaje="Bienvenido";
			break;
		case "Ingles":
			mensaje="Welcome";
			break;
		case "Italiano":
			mensaje="Bienvenito";
			break;
		default:
			mensaje="Castellano";
			break;
		}
		return mensaje;
	}
}
