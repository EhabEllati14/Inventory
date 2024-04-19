package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Delete {
	//We do the combobox because we have the options brand and not brand . 
	ComboBox<String> combod = new ComboBox<>();
	
	//we do all the controls privates ! 
	
	private Button delete, cancel2, search2, backd;
	private Label type2, quantity2, price2;
	private TextField textde1, textde2, textde3, textde4;
	
	// we do own Stage to the delete !
	Stage Stage4;
	// we puts all the controls in the gridpane!
	GridPane gridde = new GridPane();

	Delete() {
		// default Constructor !

		//We do String for the options brand and not brand .
		String[] s = { "Brand", "Not Brand" };
		// we use the observ. list to put the string array inside the combo. 
		ObservableList<String> items = FXCollections.observableArrayList(s);
		combod.getItems().addAll(items);
		combod.setEditable(true);
		combod.setMaxSize(200, 200);

		type2 = new Label("Type : ");
		type2.setMaxWidth(200);
		type2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		quantity2 = new Label("Quantity : ");
		quantity2.setMaxWidth(200);
		quantity2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		price2 = new Label("Price : ");
		price2.setMaxWidth(200);
		price2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		delete = new Button("Delete");
		delete.setMaxWidth(200);
		delete.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		cancel2 = new Button(" Cancel ");
		cancel2.setMaxSize(200, 200);
		cancel2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		search2 = new Button("  Search  ");
		search2.setMaxWidth(200);
		search2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		backd = new Button(" Main Page ");
		backd.setMaxWidth(200);
		backd.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		textde1 = new TextField();
		textde1.setMaxWidth(200);
		textde1.setMaxHeight(200);

		textde2 = new TextField();
		textde2.setMaxWidth(200);
		textde2.setMaxHeight(200);

		textde3 = new TextField();
		textde3.setMaxWidth(200);
		textde3.setMaxHeight(200);

		textde4 = new TextField();
		textde4.setMaxWidth(200);
		textde4.setMaxHeight(200);
       
		// we put all the controls inside the gridPane 
		gridde.add(combod, 1, 0);
		gridde.add(type2, 0, 1);
		gridde.add(quantity2, 0, 2);
		gridde.add(price2, 0, 3);
		gridde.add(textde1, 1, 1);
		gridde.add(textde2, 1, 2);
		gridde.add(textde3, 1, 3);
		gridde.add(delete, 0, 5);
		gridde.add(cancel2, 1, 5);
		gridde.add(backd, 0, 6);
		gridde.setVgap(10);
		gridde.setHgap(15);
		gridde.setPadding(new Insets(20, 20, 20, 20));
		gridde.setStyle("-fx-background-color:gray; ");

	}
     // setters and getters for all buttons and labels 
	public Button getBackd() {
		return backd;
	}

	public Button getDelete() {
		return delete;
	}

	public Button getCancel2() {
		return cancel2;
	}

	public Label getType2() {
		return type2;
	}

	public Label getQuantity2() {
		return quantity2;
	}

	public Label getPrice2() {
		return price2;
	}

	public TextField getTextde1() {
		return textde1;
	}

	public TextField getTextde2() {
		return textde2;
	}

	public TextField getTextde3() {
		return textde3;
	}

	public void setCombod(ComboBox<String> combod) {
		this.combod = combod;
	}

	public void setTextde1(TextField textde1) {
		this.textde1 = textde1;
	}

	public void setTextde2(TextField textde2) {
		this.textde2 = textde2;
	}

	public void setTextde3(TextField textde3) {
		this.textde3 = textde3;
	}

	public ComboBox<String> getCombod() {
		return combod;
	}

	public Button getSearch2() {
		return search2;
	}

	public TextField getTextde4() {
		return textde4;
	}

	public void setText4(TextField textde4) {
		this.textde4 = textde4;
	}
 // we use getters for the gridpane to put them inside th scene!
	public GridPane getgridde() {
		return gridde;
	}

}
