package application;

import javafx.geometry.Insets;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StockReport {
	private Text text;
	private TextArea textarea;
	private CheckBox texta, expfile;
	private TextField textfield;
	private Button export, mainpage;

	BorderPane border = new BorderPane();
	GridPane gd = new GridPane();
	Stage stage5;

	StockReport() {
		text = new Text("The Following Options Can Be Used To Print A Report : ");
		text.setFill(Color.BLACK);
		text.setFont(Font.font("Times New Roman ", FontWeight.BOLD, FontPosture.ITALIC, 20));

		texta = new CheckBox("TextArea");
		texta.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 16));

		expfile = new CheckBox("Export a Copy to a File");
		expfile.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 16));

		textarea = new TextArea();
		textarea.setWrapText(true);
		textarea.setMaxWidth(600);
		textarea.setMaxHeight(800);

		textfield = new TextField();
		textfield.setMaxWidth(100);
		textfield.setMaxHeight(100);

		mainpage = new Button("-> Main Page <-");
		mainpage.setMaxSize(200, 200);
		mainpage.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));

		export = new Button("Export");

		border.setTop(text);
		border.setBottom(mainpage);
		gd.add(expfile, 0, 0);
		gd.add(texta, 1, 0);
		gd.setVgap(15);
		gd.setHgap(15);
		gd.setPadding(new Insets(15, 15, 15, 15));
		border.setCenter(gd);
		border.setStyle("-fx-background-color:gray; ");

	}

	public Button getMainpage() {
		return mainpage;
	}

	public GridPane getGd() {
		return gd;
	}

	public Text getText() {
		return text;
	}

	public TextArea getTextarea() {
		return textarea;
	}

	public CheckBox getTexta() {
		return texta;
	}

	public CheckBox getExpfile() {
		return expfile;
	}

	public TextField getTextfield() {
		return textfield;
	}

	public Button getExport() {
		return export;
	}

	public void setTextarea(TextArea textarea) {
		this.textarea = textarea;
	}

	public void setTextfield(TextField textfield) {
		this.textfield = textfield;
	}

	public BorderPane getBorder() {
		return border;
	}

}
