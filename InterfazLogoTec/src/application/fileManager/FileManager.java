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

public class FileManager {

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
	
	public void appendOnFile() {
		
	}
	
}
