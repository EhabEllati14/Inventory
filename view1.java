package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class view1 extends Group {
	// here we declare the private buttons and labels.
	private Button bt1, bt2, bt3, bt4, bt5;
	private Label main;

	// here we declare the stage as a variable :
	Stage stage1;
	// we use group layout to add all the controls and nodes to the group.
	Group p = new Group();
	
	view1() {
		
		 // default constructor 
		
		// we use Hbox to add the buutons (Add, Modify , Delete , StockReport).
		HBox hp = new HBox(40);

		// we declare the sizes and the names of the buttons and the labels!
		bt1 = new Button(" Add ");
		bt1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
		bt1.setMaxSize(100, 100);

		bt2 = new Button(" Modify ");
		bt2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
		bt2.setMaxSize(100, 100);

		bt3 = new Button(" Delete ");
		bt3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
		bt3.setMaxSize(100, 100);

		bt4 = new Button("Stock Report");
		bt4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
		bt4.setMaxSize(100, 100);

		bt5 = new Button("Read File");
		bt5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
		bt5.setMaxSize(100, 100);

		hp.setAlignment(Pos.CENTER);

		hp.getChildren().addAll(bt1, bt2, bt3, bt4, bt5);
		hp.setLayoutX(250);
		hp.setLayoutY(550);
		main = new Label();
		main.setText("~ Inventory Management System : Comp 2311 Project , Phase2 ~");
		main.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		main.setTextFill(Color.BLUE.darker());
		main.setLayoutX(150);

		Image img = new Image("inventoryManagement.jpg");
		ImageView m = new ImageView(img);
		m.setFitHeight(300);
		m.setFitWidth(300);
		m.setLayoutX(300);
		m.setLayoutY(100);
		m.setRotate(45);

		p.getChildren().addAll(main, m, hp);

	}

	public Button getBt5() {
		return bt5;
	}

	public Button getBt1() {
		return bt1;
	}

	public Button getBt2() {
		return bt2;
	}

	public Button getBt3() {
		return bt3;
	}

	public Button getBt4() {
		return bt4;
	}

	public Label getMain() {
		return main;
	}

	public Group getP() {
		return p;
	}

}
