package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {
	
	@FXML
	private TableView<Department> tableViewDepartment;
	
	@FXML
	private Button btNew;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnIdCompany;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnType;

	@FXML
	private TableColumn<Department, String> tableColumnName;

	@FXML
	private TableColumn<Department, Integer> tableColumnCostCenter;
	
	@FXML
	private void onBtNewAction() {
		System.out.println("onBtNewAction");
	}


	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnIdCompany.setCellValueFactory(new PropertyValueFactory<>("idCompany"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnType.setCellValueFactory(new PropertyValueFactory<>("type"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColumnCostCenter.setCellValueFactory(new PropertyValueFactory<>("costCenter"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
	}

}
