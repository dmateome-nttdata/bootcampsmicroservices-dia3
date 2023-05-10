package com.example.demo.entity;

public class Temperatura {

	private float temp;

	public Temperatura(float temp) {
		super();
		this.temp = temp;
	}

	public float cambioTempToF(float temp) {

		float f = (temp * 9 / 5) + 32;

		return f;
	}

	public float cambioTempToC(float temp) {

		float c = (temp-32) * 5 / 9;

		return c;
	}

}
