package application;
	
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import application.fileManager.FileManager;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	VBox actionButtons;
	Stage window;
	TextArea codeArea, warningArea;
	FileManager fileManager = new FileManager();
	String currFilePath;
	
	@Override
	public void start(Stage primaryStage) {
	
		window = primaryStage;
		BorderPane root = new BorderPane();
		
		codeArea = new TextArea();
		root.setCenter(codeArea);
		warningArea = new TextArea();
		warningArea.setPrefWidth(200);
		root.setRight(warningArea);
		
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
		
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu);
		root.setTop(menuBar);
		
		Button executeButton = new Button("Ejecutar");
		executeButton.setOnAction(e -> executeCode());
		Button compileButton = new Button("Compilar");
		compileButton.setOnAction(e -> compileCode());
		
		actionButtons.getChildren().addAll(executeButton, compileButton);
		root.setLeft(actionButtons);
		
		Scene scene = new Scene(root,800,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setTitle("LogoTec");
		window.setScene(scene);
		window.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
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
	
	private void compileCode() {
		System.out.println("Compilando");
		System.out.println(codeArea.getText());
	}
	
	private void executeCode() {
		compileCode();
		System.out.println("Ejecutando");
	}
	
}
