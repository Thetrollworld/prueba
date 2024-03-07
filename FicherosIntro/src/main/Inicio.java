package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import clases.Array;
import clases.BufferReader;
import clases.EjercicioFicheros;
import clases.Persona;

public class Inicio {

	public static void main(String[] args) throws IOException  {
		BufferReader BR = new BufferReader();
		Array arr = new Array();
		EjercicioFicheros EF = new EjercicioFicheros();
		File fichero = new File("C:\\Users\\Alumno-DAW\\Desktop\\daw");
		
		File fichero2= new File ("C:\\Users\\Alumno-DAW\\Desktop\\daw\\prueba.txt");
		
		File fichero1 = new File("src/fichero1.txt");
		
		try {
		//	arr.leerFileReader(fichero);
		//	arr.leerObjeto(fichero);
			BR.LeerConBufferedReader(fichero2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("este fichero no existe");
		}
		
		EF.devolverNombre(fichero2);
		EF.rutas(fichero1);
		System.out.println(fichero2);
		EF.extension(fichero2);
		EF.leerCarpeta(fichero);
		EF.crearFile(fichero, "patatas");
		EF.ficheroPadre(fichero2);
		EF.oculto(fichero2);
		EF.longitudFichero(fichero2);
		EF.borrarFichero(fichero2);
		EF.renombrarYCopiar(fichero1);
		EF.copiar(fichero2);
	}
		
		
		
		/*try {
			leerFile(fichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("este fichero no existe");
		}*/
	
	
		/*PrintWriter ficheroSalida = null;
		try {
			ficheroSalida = new PrintWriter(fichero);
			ficheroSalida.print("Hola");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no se encuentra");
			e.printStackTrace();
		}
		finally {
			ficheroSalida.close();
		}
	}*/
	
	public static void leerFile(String fichero) throws FileNotFoundException {
		File ficheroEntrada = new File(fichero);
		if (ficheroEntrada.exists()) {
			Scanner scanner = new Scanner(ficheroEntrada);
			while(scanner.hasNext()) {//mientras haya algo para leer
				//System.out.println(scanner.next()+"\t");
				StringTokenizer palabras = new StringTokenizer(scanner.next(),",");
				while (palabras.hasMoreTokens()) {
					System.out.println(palabras.nextToken() + "\t");
				}
			}
		}
		else
			System.out.println("El fichero no existe");
	}
	
	
}
