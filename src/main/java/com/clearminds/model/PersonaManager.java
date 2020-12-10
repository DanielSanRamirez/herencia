package com.clearminds.model;

public class PersonaManager {
	
	private ServicioPersona serv;

	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}
