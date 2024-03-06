package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public BufferReader() throws FileNotFoundException {
	
	}

	//strCurrentLine = StringCurrentLine
	
	public void LeerConBufferedReader(File cadena) throws IOException {
		BufferedReader niomura = new BufferedReader(new FileReader(cadena));
		String strCurrentLine;
		
	//Si strCurrentLine que es igual al fichero es distinto de null imprime strCurrentLine	
		
		while ((strCurrentLine = niomura.readLine()) != null) {
		    System.out.println(strCurrentLine);
		}
	}
	
	
	
	

}
