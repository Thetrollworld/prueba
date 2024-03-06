package clases;

import java.io.Serializable;

public class Persona implements Serializable{
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.edad=edad;
		this.nombre=nombre;
	}
	
}
