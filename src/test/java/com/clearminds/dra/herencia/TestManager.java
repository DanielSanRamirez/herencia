package com.clearminds.dra.herencia;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		
		PersonaManager persona;
		try {
			persona = new PersonaManager("com.clearminds.smo.bdd.ServicioPersonaBDD");
			persona.insertarPersona(new Persona("Daniel", "Ramírez", "La Vicentina"));
		} catch (InstanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
