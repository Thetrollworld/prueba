package clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Array {

	public int[][] escribirArray(PrintWriter ficheroSalida){
   	int tamanio = 10;
	int contador = 0;
	
	int[][] numeros = new int[tamanio][tamanio];
	
	for(int i=0; i< numeros.length; i++) {
		for(int k=0; k<numeros[i].length; k++) {
			
			numeros[i][k]=contador;
			contador++;
		}
	}
	for(int i=0; i< numeros.length; i++) {
		
		ficheroSalida.println();
		
		for(int k=0; k<numeros[i].length; k++) {
			ficheroSalida.print(numeros[i][k]);
		}
	}
	return numeros;
	}
	
	public void leerFileReader(String ruta) throws IOException {
		FileReader fr = new FileReader(ruta);
			
		
	}
	
	public void escribirObjeto(String cadena,Persona p) throws IOException {
		FileOutputStream fos = new FileOutputStream(cadena);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		fos.close();
		oos.close();
	}
	
	public void leerObjeto(String cadena) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(cadena);
		ObjectInputStream ois = new ObjectInputStream(fis);
		if(ois.readObject() instanceof Persona) {
			Persona p = (Persona)ois.readObject();
		}
		fis.close();
		ois.close();
		};
	}
/*	public void leerArray(String cadena) {
		FileOutputStream fos = new FileOutputStream(cadena);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.write(cadena);
		}*/
	
	

