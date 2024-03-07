package clases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class EjercicioFicheros {

	
public void devolverNombre(File fichero2) {
	
	System.out.println(fichero2.getName());
		
	}

public void rutas(File fichero2) {
	System.out.println("ruta absoluta: " + fichero2.getAbsolutePath());
	System.out.println("ruta relativa: " + fichero2.getPath());
	
}
public String extension(File fichero2) {
	String nombre = fichero2.getName();
	
	int posExtension  = nombre.lastIndexOf('.');
	if(posExtension!=-1) {
		String extension = nombre.substring(posExtension);
		System.out.println("La extension es: " + extension);
	}
	if (fichero2.isFile()){
		System.out.println(nombre + " es un fichero");
	}
	else {
		System.out.println(nombre + " es un directorio");
	}
	return nombre;
	
}
public void leerCarpeta(File fichero) {
	/*Hay que cambiarlo, el resultado no da la ruta*/
	if(fichero.isDirectory()) {
		for(int i = 0; i < fichero.list().length; i++) {
			System.out.println("El contenido del directorio es:");
			System.out.println(fichero.list()); 
			System.out.println();
		}
	
	}
	else {
		System.out.println("La ruta indicada no pertenece a un directorio");
	}
}
public void crearFile(File carpeta, String nombre) throws IOException {
	if(carpeta.isDirectory()) {
		carpeta.createNewFile();
	}
}
public void ficheroPadre(File fichero) {
	System.out.println("La carpeta padre es: " + fichero.getParent());
}

public void oculto(File fichero){
	if(fichero.isHidden()) {
		System.out.println("El fichero esta oculto");
	}
	else{
		System.out.println("El fichero no esta oculto");
	}
}
public void longitudFichero(File fichero) {
	System.out.println("La longitud del fichero es de: " + fichero.length());
}
public void borrarFichero(File fichero) {
	//fichero.delete();
}
public void renombrarYCopiar(File fichero) {
	File nuevoNombre = new File("C:\\Users\\Alumno-DAW\\Desktop\\daw\\nuevoNombre.txt");
	if(fichero.renameTo(nuevoNombre)) {
		System.out.println("Archivo renombrado");
	}
	else {
		System.out.println("No renombrado");
	}
}
public void copiar(File fichero1) throws IOException {
	File nuevoNombre = new File("C:\\Users\\Alumno-DAW\\Desktop\\daw\\nuevoNombre.txt");
	Files.copy(Paths.get(fichero1.getAbsolutePath()), Paths.get(nuevoNombre.getAbsolutePath()),StandardCopyOption.REPLACE_EXISTING);
	/*Otra solucion*/
	FileOutputStream fos = new FileOutputStream(nuevoNombre);
	Files.copy(Paths.get(fichero1.getAbsolutePath()), fos);
}

}

