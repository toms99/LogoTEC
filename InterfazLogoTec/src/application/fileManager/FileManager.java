package application.fileManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.stage.FileChooser;

/*
 * Clase encargada de tratar con los archivos dentro de la interfaz
 * Retorna un booleano, null o un String
 */
public class FileManager {

	/*
	 * Lee un archivo indicado por el usuario mediante el explorador de archivos
	 * Entradas: path indicado por el usuario
	 * Salidas: String con el contenido del archivo, retorna null si el archivo no existe
	 * Restricciones: path debe ser un archivo .txt
	 */
	public String readFile(String path) {
		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String content = "";
			String line;
			
			while((line = reader.readLine()) != null) {
				content += line;
				content += "\n";
				//System.out.println(line);
			}
			System.out.println(content);
			reader.close();
			
			return content;
		}catch(Exception e){
			return null;
		}
		
	}
	
	/*
	 * Escribe el un archivo especificado por el usuario, simplemente sobreescribe el 
	 * contenido del fichero
	 * Entradas: path(String): Path del archivo a sobreescribir, content(String): contenido del editor a escribir en el archivo
	 * Salidas: Booleano indicando si se pudo sobreescribir el contenido del archivo
	 * Restricciones: path debe ser un archivo .txt 
	 */
	public boolean writeFile(String path, String content) {
		
		try {
			
			
			//Escribir el contenido anterior y el nuevo registrado
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			
			bw.write(content);
			bw.flush();
			bw.close();
			
			return true;
			
		}catch(Exception e) {
			System.out.print("pecha");
			
			return false;
		}
		
	}
	
}
