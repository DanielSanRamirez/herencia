package com.clearminds.dra.herencia;

import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		
		PersonaManager persona = new PersonaManager();
		persona.insertarPersona(new Persona("Daniel", "Ramírez", "La Vicentina"));

	}

}
