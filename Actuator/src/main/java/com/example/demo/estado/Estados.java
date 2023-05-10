package com.example.demo.estado;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="estados")
public class Estados {
	
	private List<String> listEstados=new ArrayList<>();
	
	@ReadOperation
	public List<String> listEstados(){
		return listEstados;
	}
	
	@WriteOperation
	public void saveEstados(@Selector String estadoNuevo) {
		listEstados.add(estadoNuevo);
	}
	
	@DeleteOperation
	public void deleteEstados(@Selector String estado) {
		listEstados.remove(estado);
	}

	
}
