package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.DepartmentService;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemVendedores;
	
	@FXML
	private MenuItem menuItemDepartamentos;
	
	@FXML
	private MenuItem menuItemFechar;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemVendedoresAction() {
		System.out.println("Vendedores");
	}
	
	@FXML
	public void onMenuItemDepartamentosAction() {
		loadView("/gui/DepartamentList.fxml", 
				(DepartmentListController controller) -> {
					controller.setDepartmentService(new DepartmentService());
					controller.updateTableView();
				});
	}
	
	@FXML
	public void onMenuItemFecharAction() {
		System.out.println("Fechar");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/About.fxml", x -> {});
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}
	
	private synchronized <T> void loadView(String absolutePath, Consumer<T> initAction) {	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutePath));
			VBox newVBox = loader.load();
			// Pega referencia do Scene Principal 
			Scene mainScene = Main.getMainScene();
			
			// Guarda referencia do Content filho na variavel mainVBox 
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			//Guarda children VBox na variavel mainMenu
			Node mainMenu = mainVbox.getChildren().get(0);
			
			//Limpa tela abaixo do Menu
			mainVbox.getChildren().clear();
			
			//Adiciona o Menu
			mainVbox.getChildren().add(mainMenu);
			
			//Adiciona a tela de SOBRE
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initAction.accept(controller);
			
		} 
		catch(IOException ioe) {
			Alerts.showAlert("IOException", "Arjios: Error loader view", ioe.getMessage(), AlertType.ERROR);
		}

	}

}
