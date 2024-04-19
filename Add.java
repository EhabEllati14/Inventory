package application;

import java.awt.Color;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Add extends GridPane {
	// Here we declare private buttons ,labels ,textfields,....
	// Because we declare them private so we need setters and getters.
	private Button save, cancel, backa;
	private Label type, q, price, brand, brandn;
	Label error1;
	private TextField t1, t2, t3, t4;
	private RadioButton radio1, radio2;
	
	// we use toggleGroup because id we click one option so the another option will be false !
	
	ToggleGroup tog = new ToggleGroup();
	
	// we declare stage for the add class without make an object!
	Stage a;
	GridPane g = new GridPane();

	Add() {
		// we use an default constructor
		
		// here we declare all the sizes of the labels and texts,...
		//we use Font for the size and Color and so on,......

		type = new Label("Type : ");
		type.setMaxWidth(100);
		type.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		save = new Button(" Save ");
		save.setMaxWidth(150);
		save.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		cancel = new Button("  Cancel  ");
		cancel.setMaxWidth(150);
		cancel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		backa = new Button("   Main Page  ");
		backa.setMaxWidth(150);
		backa.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		q = new Label("Quantity : ");
		q.setMaxWidth(100);
		q.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		price = new Label("Price : ");
		price.setMaxWidth(100);
		price.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		brand = new Label("Brand : ");
		brand.setMaxWidth(100);
		brand.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		t1 = new TextField();
		t1.setMaxWidth(200);
		t1.setMaxHeight(200);

		t2 = new TextField();
		t2.setMaxWidth(200);
		t2.setMaxHeight(200);

		t3 = new TextField();
		t3.setMaxWidth(200);
		t3.setMaxHeight(200);

		t4 = new TextField();
		t4.setMaxWidth(200);
		t4.setMaxHeight(200);

		radio1 = new RadioButton("Yes :");
		radio1.setMaxSize(100, 100);
		radio1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		radio2 = new RadioButton("No :");
		radio2.setMaxSize(100, 100);
		radio2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		radio1.setToggleGroup(tog);
		radio2.setToggleGroup(tog);

		brandn = new Label("Brand Name : ");
		brandn.setMaxWidth(100);
		brandn.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
		
		// we add all the controls to the gridPane :

		g.add(brand, 0, 0);
		g.add(radio1, 1, 0);
		g.add(radio2, 2, 0);
		g.add(type, 0, 1);
		g.add(t1, 1, 1);
		g.add(q, 0, 2);
		g.add(t2, 1, 2);
		g.add(price, 0, 3);
		g.add(t3, 1, 3);
		g.add(save, 0, 6);
		g.add(cancel, 1, 6);
		g.add(backa, 0, 7);
		g.setVgap(10);
		g.setHgap(15);
		g.setPadding(new Insets(15, 15, 15, 15));
		g.setStyle("-fx-background-color:gray; ");

	}
	// Setters & Getters for the controls:

	public void setRadio1(RadioButton radio1) {
		this.radio1 = radio1;
	}

	public void setRadio2(RadioButton radio2) {
		this.radio2 = radio2;
	}

	public Button getBacka() {
		return backa;
	}

	public Button getSave() {
		return save;
	}

	public Button getCancel() {
		return cancel;
	}

	public Label getType() {
		return type;
	}

	public Label getQ() {
		return q;
	}

	public Label getPrice() {
		return price;
	}

	public Label getBrand() {
		return brand;
	}

	public Label getBrandn() {

		return brandn;
	}

	public TextField getT1() {
		return t1;
	}

	public TextField getT2() {
		return t2;
	}

	public TextField getT3() {
		return t3;
	}

	public TextField getT4() {
		return t4;
	}

	public RadioButton getRadio1() {
		return radio1;
	}

	public RadioButton getRadio2() {
		return radio2;
	}

	public void setT1(TextField t1) {
		this.t1 = t1;
	}

	public void setT2(TextField t2) {
		this.t2 = t2;
	}

	public void setT3(TextField t3) {
		this.t3 = t3;
	}

	public void setT4(TextField t4) {
		this.t4 = t4;
	}
    //we do Getter for the gridPane to put them on the scene!   
	public GridPane getAdd() {
		return g;
	}

}
