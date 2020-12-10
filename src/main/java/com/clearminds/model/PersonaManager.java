package com.clearminds.model;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager(String nombre) throws InstanceException {
		Class<?> clase;

		try {
			clase = Class.forName(nombre);
			try {
				serv = (ServicioPersona) clase.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
				throw new InstanceException("Error al obtener una instancia de Servicio Persona");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				throw new InstanceException("Error al obtener una instancia de Servicio Persona");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		}

	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}
