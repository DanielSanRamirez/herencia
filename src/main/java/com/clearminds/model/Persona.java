package com.clearminds.model;

public class Persona {

	private String nombres;
	private String apellidos;
	private String direccion;
	
	public Persona(String nombres, String apellidos, String direccion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + "]";
	}
	
}
