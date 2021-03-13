package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("Departamentos");
	}
	
	@FXML
	public void onMenuItemFecharAction() {
		System.out.println("Fechar");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("Sobre");
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}
}
