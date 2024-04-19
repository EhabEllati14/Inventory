package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Modify extends GridPane {
	// we use combobox for the options brand or not brand 
	ComboBox<String> combo = new ComboBox<>();
	 // we define all the controls and textfields private
	private Button update, cancel1, search, backm;
	private Label type1, quantity1, price1;
	private TextField textmo1, textmo2, textmo3, textmo4;
	Stage Stage3;
	GridPane gridm = new GridPane();

	Modify() {
// default constructor
		String[] s = { "Brand", "Not Brand" };
		ObservableList<String> items = FXCollections.observableArrayList(s);
		combo.getItems().addAll(items);
		combo.setEditable(true);
		combo.setMaxSize(200, 200);

		type1 = new Label("Type : ");
		type1.setMaxWidth(200);
		type1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		quantity1 = new Label("Quantity : ");
		quantity1.setMaxWidth(200);
		quantity1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		price1 = new Label("Price : ");
		price1.setMaxWidth(200);
		price1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		update = new Button(" Update ");
		update.setMaxWidth(200);
		update.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		cancel1 = new Button("Cancel");
		cancel1.setMaxWidth(200);
		cancel1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		search = new Button(" Search ");
		search.setMaxWidth(200);
		search.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		backm = new Button("Main Page");
		backm.setMaxWidth(200);
		backm.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		textmo1 = new TextField();
		textmo1.setMaxWidth(200);
		textmo1.setMaxHeight(200);

		textmo2 = new TextField();
		textmo2.setMaxWidth(200);
		textmo2.setMaxHeight(200);

		textmo3 = new TextField();
		textmo3.setMaxWidth(200);
		textmo3.setMaxHeight(200);

		textmo4 = new TextField();
		textmo4.setMaxWidth(200);
		textmo4.setMaxHeight(200);

		// we put all nodes inside the grid pane .
		gridm.add(combo, 1, 0);
		gridm.add(type1, 0, 1);
		gridm.add(quantity1, 0, 2);
		gridm.add(price1, 0, 3);
		gridm.add(textmo1, 1, 1);
		gridm.add(textmo2, 1, 2);
		gridm.add(textmo3, 1, 3);
		gridm.add(update, 0, 5);
		gridm.add(cancel1, 1, 5);
		gridm.add(backm, 0, 6);
		gridm.setVgap(10);
		gridm.setHgap(15);
		gridm.setPadding(new Insets(20, 20, 20, 20));
		gridm.setStyle("-fx-background-color:gray; ");
	}
// setters and getters for the controls .
	public Button getBackm() {
		return backm;
	}

	public Button getUpdate() {
		return update;
	}

	public Button getCancel1() {
		return cancel1;
	}

	public Label getType1() {
		return type1;
	}

	public Label getQuantity1() {
		return quantity1;
	}

	public Label getPrice1() {
		return price1;
	}

	public TextField getTextmo1() {
		return textmo1;
	}

	public TextField getTextmo2() {
		return textmo2;
	}

	public TextField getTextmo3() {
		return textmo3;
	}

	public void setCombo(ComboBox<String> combo) {
		this.combo = combo;
	}

	public void setTextmo1(TextField textmo1) {
		this.textmo1 = textmo1;
	}

	public void setTextmo2(TextField textmo2) {
		this.textmo2 = textmo2;
	}

	public void setTextmo3(TextField textmo3) {
		this.textmo3 = textmo3;
	}

	public ComboBox<String> getCombo() {
		return combo;
	}

	public Button getSearch() {
		return search;
	}

	public TextField getTextmo4() {
		return textmo4;
	}

	public void setTextmo4(TextField textmo4) {
		this.textmo4 = textmo4;
	}
 // we use getters for the gridpane to put them inside the scene !
	public GridPane getGridm() {
		return gridm;
	}

}
