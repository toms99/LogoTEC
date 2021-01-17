package TEC.Proyecto_LogoTEC;
	
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import TEC.Proyecto_LogoTEC.tortuga.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

/*
 * Clase principal de la interfaz gráfica, se inicia el programa aquí y la ventana del editor
 * se programó en esta clase
 */

public class Main extends Application {
	

	// Constantes de ANTLR
	private static final String EXTENSION = "logoTEC";
	
	//Widgets y variables del programa
	VBox actionButtons,codePane, warningPane;
	Stage window;
	TextArea codeArea, warningArea;
	FileManager fileManager = new FileManager();
	String currFilePath;
	Integer textAreaHeight = 300;
	Lector l;
	
	/*
	 * En esta función se inicia el programa, genera la primer ventana junto con todos
	 * los widgets presente en esta
	 * Entradas: primaryStage es la primera ventana, que luego se renombra con window para ser más específicos
	 * Salidas: Ninguna, solo ejecuta el programa
	 * Restricciones: Deben instalar la librería javafx y configurar el proyecto para que pueda correrlo
	 */
	@Override
	public void start(Stage primaryStage) {
	
		window = primaryStage;
		
		//Main pane
		BorderPane root = new BorderPane();
		
		//CodePane widgets
		
		codePane = new VBox(10);
		codePane.setPadding(new Insets(10,10,10,10));
		
		Label codeAreaLabel = new Label("Editor");
		codeArea = new TextArea();
		codeArea.setPrefHeight(textAreaHeight);
		
		codePane.getChildren().addAll(codeAreaLabel, codeArea);
		root.setCenter(codePane);
		
		//WarningPane widgets
		
		warningPane = new VBox(10);
		warningPane.setPadding(new Insets(10,10,10,10));
		
		Label warningAreaLabel = new Label("Warnings!");
		warningArea = new TextArea();
		warningArea.setPrefWidth(200);
		warningArea.setPrefHeight(textAreaHeight);
		warningArea.setWrapText(true);
		
		warningPane.getChildren().addAll(warningAreaLabel, warningArea);
		root.setRight(warningPane);
		
		actionButtons = new VBox(10);
		actionButtons.setPadding(new Insets(10,10,10,10));
		//File menu
		Menu fileMenu = new Menu("File");
		
		//Menu items
		MenuItem open = new MenuItem("Abrir...");
		open.setOnAction(e ->  openFile());
		fileMenu.getItems().add(open);
		
		fileMenu.getItems().add(new SeparatorMenuItem());
		
		MenuItem save = new MenuItem("Guardar");
		save.setOnAction(e ->  saveFile(codeArea.getText()));
		fileMenu.getItems().add(save);
		
		//Barra superior de File
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu);
		root.setTop(menuBar);
		
		//Botones
		Button executeButton = new Button("Ejecutar");
		executeButton.setOnAction(e -> executeCode());
		Button compileButton = new Button("Compilar");
		compileButton.setOnAction(e -> compileCode());
		Button printASTButton = new Button("Imprimir AST");
		printASTButton.setOnAction(e -> printAST());
		
		actionButtons.getChildren().addAll(executeButton, compileButton, printASTButton);
		root.setLeft(actionButtons);

		l=new Lector();

		Scene scene = new Scene(root,800,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setTitle("LogoTec");
		window.setScene(scene);
		window.show();
		
		
	}
	
	/*
	 * Método main que carga javafx
	 */
	public static void main(String[] args) throws IOException {
		
		
		launch(args);
	}
	
	/*
	 * Abre un archivo desde el explorador de windows, tiene que ser un .txt aunque luego
	 * hago un formato especifico para el compilador y evitar errores
	 * Entradas: Ninguna
	 * Salidas: Ninguna, abre o no abre el archivo
	 * Restricciones: El archivo a abrir debe ser un .txt
	 */
	private void openFile() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		
		File selectedFile = fileChooser.showOpenDialog(window);
		
		if(selectedFile != null) {
			currFilePath = selectedFile.getAbsolutePath();
			System.out.println(currFilePath);
			String content = fileManager.readFile(currFilePath);
			codeArea.setText(content);
		} else {
			System.out.println("File is not valid");
		}
		
	}
	
	/*
	 * Guarda el contenido del editor en el archivo correspondiente
	 * Si no se ha especificado un fichero al cual guardar, abre el explorador de archivos
	 * y pide guardarlo, guardar archivo como .txt
	 * Si ya se abrió un archivo, nada más lo sobreescribe con el contenido del editor
	 * Entradas: content (String): Contenido del editor de código
	 * Salidas: -
	 * Restricciones: Guardar archivo como .txt
	 */
	private void saveFile(String content) {
		
		if(!fileManager.writeFile(currFilePath, content)) {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Save Resource File");
			
			File selectedFile = fileChooser.showSaveDialog(null);
			
			BufferedWriter bw;
			if(selectedFile != null) {
				String path = selectedFile.getAbsolutePath();
				try {
					bw = new BufferedWriter(new FileWriter(path));
					bw.write(content);
					bw.flush();
					bw.close();
					currFilePath = path;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				// TODO Auto-generated catch block
				System.out.println("No selecciona un archivo");
			}
		}
		
	}
	
	/*
	 * Función que compila el código con el contenido del editor
	 */
	private void compileCode() {
		
		
		System.out.println("Compilando...");
		System.out.println(codeArea.getText());
		
		fileManager.writeFile(currFilePath, codeArea.getText());
		
		String program = currFilePath;

		System.out.println("Interpreting file " + program);

		try {
			LogoTECLexer lexer;
			lexer = new LogoTECLexer(new ANTLRFileStream(program));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			LogoTECParser parser = new LogoTECParser(tokens);
			ErrorManager errorManager = new ErrorManager(warningArea);
			
			parser.removeErrorListeners(); // remove ConsoleErrorListener
	        
	        parser.addErrorListener(errorManager); // add ours
	        //
	        parser.programa(); // parse as usual
	        
			LogoTECParser.ProgramaContext tree = parser.programa();
			System.out.println(tree.toStringTree(parser));

			LogoTECCustomVisitor visitor = new LogoTECCustomVisitor();
			visitor.visit(tree);
			
			
			System.out.println("Interpretation finished");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}
	
	/*
	 * Función que compila el código con el contenido del editor y luego trata de ejecutarlo
	 */
	private void executeCode()  {
		compileCode();
		System.out.println("Ejecutando...");
		l.Texto(codeArea.getText().split("\n"));
	}
	
	/*
	 * Función que muestra el AST generado por el compilador
	 */
	
	private void printAST() {
		System.out.println("Imprimiendo AST...");
	}
	
	
}

