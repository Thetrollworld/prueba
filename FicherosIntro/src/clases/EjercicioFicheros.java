package clases;

import java.io.File;

public class EjercicioFicheros {

	
public void devolverNombre(File fichero) {
	System.out.println(fichero.getName());
		
	}

public void rutas(File fichero) {
	System.out.println("ruta absoluta: " + fichero.getAbsolutePath());
	System.out.println("ruta relativa: " + fichero.getPath());
	
}



}
