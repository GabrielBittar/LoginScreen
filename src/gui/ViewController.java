package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTest;
	
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", null, "You are logged in!", AlertType.INFORMATION);
	}
	
	@FXML
	private Button signUp;
	
	public void onSignUpAction() {
		Alerts.showAlert("Alert title", null, "You are signing in...", AlertType.INFORMATION);
	}
}
