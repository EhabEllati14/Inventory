package application;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
// we use this class for the error to show them in the new stage 
public class WarningFound {
	// private button that id the user click it so we move it to the  firt stage 
	private Button Ok;
	Stage war;
	BorderPane bp = new BorderPane();
	HBox vb = new HBox();

	WarningFound() {
		Ok = new Button("OK");
		Ok.setMaxSize(50, 10);

		bp.setCenter(Ok);

	}

	public Button getOk() {
		return Ok;
	}

	public BorderPane getBp() {
		return bp;
	}

}
