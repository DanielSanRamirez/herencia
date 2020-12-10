package com.clearminds.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager(String nombrePropiedad) throws InstanceException {
		Class<?> clase;

		try {
			String nombre = leerPropiedad(nombrePropiedad);
			
			if (nombre != null) {
				clase = Class.forName(nombre);
				serv = (ServicioPersona) clase.newInstance();	
			} else {
				throw new InstanceException("Error al obtener una instancia de Servicio Persona");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		}

	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
	public static String leerPropiedad(String nombrePropiedad) {		
		File file = new File("D:\\CapacitacionCMC\\WorkspaceCMC\\herencia\\config.properties");
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			List<String> propiedades = new ArrayList<String>();
			
			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				String nombre = buscar(linea, nombrePropiedad);
				if (nombre != null) {
					return nombre;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static String buscar(String linea, String nombrePropiedad) {
		String p = null;
		try {
			String[] partes = linea.split(":");
			if (partes[0].equals(nombrePropiedad)) {
				return partes[1];
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
