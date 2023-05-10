package com.example.demo.servicios;

import org.springframework.stereotype.Service;

import com.example.demo.Saludo;

@Service
public class Services {

	public Services() {

	}

	public String usoSaludo(String idioma) {
		Saludo claseSaludo = new Saludo(idioma);
		return claseSaludo.mensajeSaludo();
	}
}
