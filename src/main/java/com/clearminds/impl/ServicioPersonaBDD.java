package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona: " + persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona: " + persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona: " + persona);
		return true;
	}

}
