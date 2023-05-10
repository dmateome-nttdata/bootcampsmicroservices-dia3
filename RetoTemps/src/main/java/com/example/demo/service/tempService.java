package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Temperatura;

@Service
public class tempService {

	public tempService() {

	}

	public float cambioTempToF(float temp) {
		Temperatura classTemp = new Temperatura(temp);
		return classTemp.cambioTempToF(temp);
	}
	
	public float cambioTempToC(float temp) {
		Temperatura classTemp = new Temperatura(temp);
		return classTemp.cambioTempToC(temp);
	}
}
