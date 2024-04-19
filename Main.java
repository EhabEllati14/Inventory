//First Welcome To My Project !!
//Name : Ehab Maher Elia Ellati.
//Student Id : 1211567.
//Project Phase '2'.
package application;
// Here we import all the panes and layout,.....
// And we use the imports for the file because we think that there's exceptions!
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {
	view1 view = new view1();
	Add add = new Add();
	Modify modify = new Modify();
	Delete delete = new Delete();
	StockReport stock = new StockReport();
	// first we make objects for the classes which each one of them is class.
	Inventory store = new Inventory("groceries");
	
	// We Make Object From The Inventory To Use The Methods Inside it!
	WarningFound wf = new WarningFound();
	Stage stage2 = new Stage();
	Stage stage1 = new Stage();
	Stage stage3 = new Stage();
	Stage stage4 = new Stage();
	Stage stage5 = new Stage();
	
	// Here we defined the stages for each class have stage.
	
	Stage warningstage = new Stage();
	Scene scene1 = new Scene(view.getP(), 900, 600, Color.GRAY);
	Scene scene2 = new Scene(add.getAdd(), 800, 550);
	Scene scene3 = new Scene(modify.getGridm(), 800, 550);
	Scene scene4 = new Scene(delete.getgridde(), 800, 550);
	Scene scene5 = new Scene(stock.getBorder(), 900, 600);
	Scene warningscene = new Scene(wf.getBp(), 300, 300);
	// Here we call the classes and then we get the panes and we put them in scenes.
	//We use the scenes to show the panes with all controls.
	
	Label Error = new Label();
	Label Error2 = new Label();
	Label message = new Label();
	Label message2 = new Label();
   // Here we use the labels to print the errors for print the error like (please use option yes or no)
	public void start(Stage primaryStage) {
		try {
			add.getAdd().add(store.out, 3, 9);
			wf.getBp().setTop(store.out1);
			delete.getgridde().add(store.out2, 3, 7);
			modify.getGridm().add(message,3, 8);
			add.getAdd().add(Error, 3, 8);
			modify.getGridm().add(Error2, 3, 8);
			delete.getgridde().add(message2, 3, 8);
			modify.setAlignment(Pos.CENTER);
   // here we adds the messages from the inventory class to the scenes .
  			
			view.getBt1().addEventHandler(ActionEvent.ACTION, new Events());
			view.getBt2().addEventHandler(ActionEvent.ACTION, new Events());
			view.getBt3().addEventHandler(ActionEvent.ACTION, new Events());
			view.getBt4().addEventHandler(ActionEvent.ACTION, new Events());
			view.getBt5().addEventHandler(ActionEvent.ACTION, new Events());
			add.getRadio1().addEventHandler(ActionEvent.ACTION, new Events());
			add.getRadio2().addEventHandler(ActionEvent.ACTION, new Events());
			add.getSave().addEventHandler(ActionEvent.ACTION, new Events());
			add.getBacka().addEventHandler(ActionEvent.ACTION, new Events());
			add.getCancel().addEventHandler(ActionEvent.ACTION, new Events());
			modify.getBackm().addEventHandler(ActionEvent.ACTION, new Events());
			modify.getCombo().addEventHandler(ActionEvent.ACTION, new Events());
			modify.getCancel1().addEventHandler(ActionEvent.ACTION, new Events());
			modify.getSearch().addEventHandler(ActionEvent.ACTION, new Events());
			modify.getUpdate().addEventHandler(ActionEvent.ACTION, new Events());
			delete.getCancel2().addEventHandler(ActionEvent.ACTION, new Events());
			delete.getBackd().addEventHandler(ActionEvent.ACTION, new Events());
			delete.getCombod().addEventHandler(ActionEvent.ACTION, new Events());
			delete.getSearch2().addEventHandler(ActionEvent.ACTION, new Events());
			delete.getDelete().addEventHandler(ActionEvent.ACTION, new Events());
			stock.getTexta().addEventHandler(ActionEvent.ACTION, new Events());
			stock.getMainpage().addEventHandler(ActionEvent.ACTION, new Events());
			stock.getExpfile().addEventHandler(ActionEvent.ACTION, new Events());
			stock.getExport().addEventHandler(ActionEvent.ACTION, new Events());
			wf.getOk().addEventHandler(ActionEvent.ACTION, new Events());
			// set on action to make the action but all defentions of all actions inside the events class. 
			// Here we use the actions so we call the class events which  this class have all actions.
			stage1.setScene(scene1);
			stage1.setTitle("Inventory Management System");
			stage1.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		launch(args);
	}

	public class Events implements EventHandler<ActionEvent> {
		Main m = new Main();

		@Override
		public void handle(ActionEvent e) {
// e.getsource that if this or click is instance from button and the text of button is equal what are you clicked it .
			if (e.getSource() instanceof Button && ((Button) e.getSource()).getText().equals(view.getBt1().getText())) {
				// if this statement is true set the stage with scene 2.
				stage2.setScene(scene2);
				
				// the title of stage i
				stage2.setTitle("Add New Item");
				
				// we close the menu interface
				stage1.close();
				stage2.show();

			} else if (e.getSource() instanceof RadioButton && (RadioButton) e.getSource() == add.getRadio1()) {
				// if the user click the option yes so this type for the brands type !
				add.getAdd().add(add.getBrandn(), 0, 5);
				add.getAdd().add(add.getT4(), 1, 5);
				stage2.setScene(scene2);
				stage2.show();

			} else if (e.getSource() instanceof RadioButton && (RadioButton) e.getSource() == add.getRadio2()) {
				// if the options click the option no so this option for the type without brand !
				add.getAdd().getChildren().removeAll(add.getBrandn(), add.getT4());
				stage2.setScene(scene2);
				stage2.show();
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(add.getBacka().getText())) {
				// if the user click the mainpage so we go the first stage which is the menu interface 
				// we set all the controls and field , textfields false .
				// we set the masseges false .
				add.getT1().setText(null);
				add.getT2().setText(null);
				add.getT3().setText(null);
				store.out1.setText(null);
				store.out.setText(null);
				store.out2.setText(null);
				add.getRadio2().setSelected(false);
				add.getRadio1().setSelected(false);
				add.getT4().setText(null);
				add.getAdd().getChildren().removeAll(add.getT4(), add.getBrandn());
				Error.setText(null);
				stage1.close();
				stage2.close();
				stage1.setScene(scene1);
				stage1.show();

			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(add.getCancel().getText())) {
				// if the user click cancel we set all the textfields empty and the options is empty.
				// we do cancel button to make all texts empty to input another item .
				store.out.setText(null);
				add.getT1().setText(null);
				add.getT2().setText(null);
				add.getT3().setText(null);
				add.getRadio2().setSelected(false);
				add.getRadio1().setSelected(false);
				add.getT4().setText(null);
				add.getAdd().getChildren().removeAll(add.getT4(), add.getBrandn());
				Error.setText(null);
				stage2.setScene(scene2);
				stage2.show();
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(add.getSave().getText())) {
				try {
					// if the user click save this button like the method new item in inventory class.
					// here we use Integer parseint to get the value of integer  
					Integer q1=Integer.parseInt(add.getT2().getText());
					// here we use the Double parseDouble to get the double price 
					Double p1=Double.parseDouble(add.getT3().getText());
					if (add.getRadio2().isSelected()) {
						store.newItem(add.getT1().getText(), q1, p1);
                     // if the user click or select the no option this mean that this type without brand.
					} else if (add.getRadio1().isSelected()) {
						store.newItem(add.getT4().getText(), add.getT1().getText(),
								q1, p1);
                    // if the user click or select the yes option this mean that this type have brand .
						// so we make text field to  write the brand name .
						// if the user click yes this textfield will show else will disappear.
					} else {
						// if the user does not choose one of the options so error message will appear!
						Error.setText(
								" ->ERROR-< \n->Plaese Choose One From Options (Yes or No)!! \n ->Please Click Cancel And Choose The Option !");
						Error.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
						Error.setTextFill(Color.RED.darker());
					}
					}
				
				catch(NumberFormatException ex) {
					System.out.println("Error:  The TextFields are null!");
					Error.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
					Error.setTextFill(Color.RED.darker());
					Error.setText("The textFields are null!");
					
				}catch (NullPointerException err) {
					// Here we do exception we write the code in the try block 
					// in  try block we write the code and if we have an error.
					// The Catch block catch the error and we print the error on the consol.
					// catch block is important to make the code continue.
					System.out.println("Error :The TextFields Are Null!");
				}
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(view.getBt2().getText())) {
				// if the user click the button modify so we show the stage of the modify.
				stage3.setScene(scene3);
				stage3.setTitle("Update Item");
				stage1.close();
				// here we close  the interface stage 
				stage3.show();

			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(modify.getBackm().getText())) {
				modify.getCombo().setValue(" ");
				// if the user click the mainpage so all the textfield are empty and the combobox are empty.
				//  here we set all the textfield false because the user must choose the one of the options in the combobox.
				modify.getCombo().setEditable(true);
				modify.getTextmo1().setEditable(false);
				modify.getTextmo2().setEditable(false);
				modify.getTextmo3().setEditable(false);
				modify.getTextmo4().setEditable(false);
				modify.getGridm().getChildren().removeAll(modify.getTextmo4(), modify.getSearch());
				// we remove the textfield number 4 and the search button.
				modify.getTextmo1().setText(null);
				modify.getTextmo2().setText(null);
				modify.getTextmo3().setText(null);
				modify.getTextmo4().setText(null);
				store.out.setText(null);
				store.out1.setText(null);
				store.out2.setText(null);
				message.setText(null);
				Error2.setText(null);
				stage1.close();
				stage3.close();
				stage1.setScene(scene1);
				stage1.show();
			}

			else if (e.getSource().equals(modify.getCombo())) {
				if (!modify.getCombo().getValue().equals("Brand")
						&& !modify.getCombo().getValue().equals("Not Brand")) {
					// Here if the user does not choose one of the options brand or not brand 
					// so will get a error message to choose one of the options .
					// first if the user does not choose one of the options so the all textfields are disable.
					modify.getCombo().setEditable(false);
					modify.getTextmo1().setEditable(false);
					modify.getTextmo2().setEditable(false);
					modify.getTextmo3().setEditable(false);
					modify.getTextmo4().setEditable(false);
					Error2.setText("->Please Choose One Of The Options:" + "\n" + " (Brand) OR (Not Brand)"
							+ "Please Click Cancel!");
					Error2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
					Error2.setTextFill(Color.RED);
				} else if (modify.getCombo().getValue().equals("Not Brand")) {
					// if the user choose the option not brand so the textfields are visible now!
					// if the user not brand so the search button only will appear on the scene!
					modify.getGridm().getChildren().removeAll(modify.getTextmo4(), modify.getSearch());
					modify.getGridm().add(modify.getSearch(), 3, 1);
					modify.getTextmo1().setEditable(true);
					modify.getTextmo2().setEditable(true);
					modify.getTextmo3().setEditable(true);
					modify.getTextmo4().setEditable(true);
					stage3.setScene(scene3);
					stage3.show();

				} else if (modify.getCombo().getValue().equals("Brand")) {
					// if the user choose the option  brand so the textfields are visible now!
					// if the user not brand so the search button  and the textfields will appear on the scene!
					modify.getGridm().getChildren().removeAll(modify.getTextmo4(), modify.getSearch());
					modify.getGridm().add(modify.getSearch(), 3, 1);
					modify.getGridm().add(modify.getTextmo4(), 2, 1);
					modify.getTextmo1().setEditable(true);
					modify.getTextmo2().setEditable(true);
					modify.getTextmo3().setEditable(true);
					modify.getTextmo4().setEditable(true);
					stage3.setScene(scene3);
					stage3.show();
				}
			}

			else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(modify.getCancel1().getText())) {
				// and we delete the error message .
				modify.getCombo().setValue(" ");
				modify.getGridm().getChildren().removeAll(modify.getTextmo4(), modify.getSearch(), Error);
				modify.getTextmo1().setText(null);
				modify.getTextmo2().setText(null);
				modify.getTextmo3().setText(null);
				modify.getTextmo4().setText(null);
				Error2.setText(null);
				store.out1.setText(null);
				message.setText(null);
				// here we use the cancel button to set all controls empty .
				// rather than delete the fields i use this button to make the textfields empty .
				// if we click cancel here again the teixtfields is divisible until the user choose one from the options.
				if (!modify.getCombo().getValue().equals("Brand")
						&& !modify.getCombo().getValue().equals("Not Brand")) {
					modify.getCombo().setEditable(false);
					modify.getTextmo1().setEditable(false);
					modify.getTextmo2().setEditable(false);
					modify.getTextmo3().setEditable(false);
					modify.getTextmo4().setEditable(false);
					// if the user does not choose the one from the options so error message will appear.
					Error2.setText("->Please Choose One Of The Options:" + "\n" + " (Brand) OR (Not Brand)"
							+ "Please Click Cancel!");
					Error2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
					Error2.setTextFill(Color.RED);
				} else {
					// but if the user choose one of the options so the textfields are visible .
					// and we delete the error message .
					Error2.setText(null);
					modify.getCombo().setValue(" ");
					modify.getCombo().setEditable(true);
					modify.getTextmo1().setEditable(true);
					modify.getTextmo2().setEditable(true);
					modify.getTextmo3().setEditable(true);
					modify.getTextmo4().setEditable(true);
					modify.getGridm().getChildren().removeAll(modify.getTextmo4(), modify.getSearch(), Error);
					modify.getTextmo1().setText(null);
					modify.getTextmo2().setText(null);
					modify.getTextmo3().setText(null);
					modify.getTextmo4().setText(null);
					store.out1.setText(null);
					message.setText(null);
					stage3.setScene(scene3);
					stage3.show();
				}
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(modify.getSearch().getText())) {
				// if the type is not from the brand so the search button will appear only. 
				// if the item is in the inventory arraylist so in the textfield will show :
				// first the Quantity of this type and the the price of the this type.
				try {
				if (modify.getCombo().getValue().equals("Not Brand")) {
					store.update(modify.getTextmo1().getText(), 0);
					modify.getTextmo3().setText(String.valueOf(store.getPrice(modify.getTextmo1().getText())));
					modify.getTextmo2().setText(String.valueOf(store.getQuantity(modify.getTextmo1().getText())));
					if (store.findItem(modify.getTextmo1().getText(), false) == -1) {
						warningstage.setScene(warningscene);
						warningstage.show();
					}
				} else if (modify.getCombo().getValue().equals("Brand")) {
					// if the type have brand so the textfield and the search will appear.
					//if the item brand are exsists in the inventory so the error message will appear.
					// first if the item does not exsists so error message will appear.
					//if the item exsist and there's no error so the information of the item will appear. 
					store.update(modify.getTextmo4().getText(), modify.getTextmo1().getText(), 0);
					// we use the  method and behaviors  inside the inventory class to see the information.
					// here we use the value of to change the quantity and the price to string by using value of .
					modify.getTextmo2().setText(String
							.valueOf(store.getQuantity(modify.getTextmo4().getText(), modify.getTextmo1().getText())));
					modify.getTextmo3().setText(String
							.valueOf(store.getPrice(modify.getTextmo4().getText(), modify.getTextmo1().getText())));
					// here we print the error in the warning stage 
					// if u click ok the stage of the warinig found will disappear.
					if (store.findItem(modify.getTextmo1().getText(), false, modify.getTextmo4().getText()) == -1) {
						warningstage.setScene(warningscene);
						warningstage.show();
					
					}
				}
				}
				
				catch(Exception ex) {
					// if the user click search and the textfields are empty so here there's and Exception!!22
					System.out.println("Error : empty String !!");
					
				
				}
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(modify.getUpdate().getText())) {
				//if the user click update first we search if the item is found or not .
				// if the item does not found so the error message will appear .
				// if the item is found you can update the quantity and price as the user input.
				// but before you update the item  you should clear the textfields and input the number you want to update it.
				try {
					// we put code in the try block because if there an error we catch it in the catch block  .
                    // if the user choose not brand .
					if (modify.getCombo().getValue().equals("Not Brand")) {
						String t1 = modify.getTextmo3().getText();
						Double d1 = Double.parseDouble(t1);
						store.update(modify.getTextmo1().getText(), d1);
						String t2 = modify.getTextmo2().getText();
						Integer d2 = Integer.parseInt(t2);
						store.update(modify.getTextmo1().getText(), d2);
						// we call the update method inside the inventory class 
						// we call the update method and we update the price and quantity.
						// here we print the message with green color that the item updated!
						message.setTextFill(Color.GREEN);
						message.setFont(Font.font("Times new romain", FontWeight.BOLD, FontPosture.ITALIC, 12));
						message.setText("The Item  is updated!!");
					}

					else if (modify.getCombo().getValue().equals("Brand")) {
						// if item is brand 
						// here we use the double parse to change the string (price)to double .
						// and parseint to the integer string (quantity).
						String m1 = modify.getTextmo3().getText();
						Double do1 = Double.parseDouble(m1);
						store.update(modify.getTextmo4().getText(), modify.getTextmo1().getText(), do1);
						String m2 = modify.getTextmo2().getText();
						Integer do2 = Integer.parseInt(m2);
						// we use the update method in the inventory class .
						store.update(modify.getTextmo4().getText(), modify.getTextmo1().getText(), do2);
						message.setTextFill(Color.GREEN);
						// if the item updated so the message will be in green that the item is updated.
						message.setFont(Font.font("Times new romain", FontWeight.BOLD, FontPosture.ITALIC, 12));
						message.setText("The Item is updated!!");
					}
					else {
						//Here if the user select update and they dont input the brand or nothing 
						// they don't input any information!
						message.setTextFill(Color.RED);
						message.setFont(Font.font("Times new romain", FontWeight.BOLD, FontPosture.ITALIC, 16));
						message.setText("Error : There's no type to updated!!");
						
					}
				} catch (Exception ex) {
					// here we catch the exception if we have an error in the try block .
					// for example mismatch if the user entered string in the quantity or price so there is an exception.
					System.out.println("Error : The textfields are Empty! ");

				}
			}

			else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(wf.getOk().getText())) {
				//if the item is cannot found or anything else so the error will appear in the box.
				modify.getCombo().setValue(" ");
				modify.getCombo().setEditable(true);
				modify.getGridm().getChildren().removeAll(modify.getTextmo4(), modify.getSearch(), Error);
				modify.getTextmo1().setText(null);
				modify.getTextmo2().setText(null);
				modify.getTextmo3().setText(null);
				modify.getTextmo4().setText(null);
				store.out.setText(null);
				message.setText(null);
				Error2.setText(null);
				warningstage.close();
				stage3.setScene(scene3);
				stage3.show();
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(view.getBt3().getText())) {
				// if the user click delete button so the stage of the delete will appear.
				stage4.setScene(scene4);
				stage4.setTitle("Delete Item");
				stage1.close();
				stage4.show();
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(delete.getCancel2().getText())) {
				// we use cancel button to set all textfield null.
				// if the user click cancel button so the textfields are setting null.
				store.out2.setText(null);
				delete.getCombod().setValue(" ");
				delete.getgridde().getChildren().removeAll(delete.getTextde4(), delete.getSearch2(), Error);
				delete.getTextde1().setText(null);
				delete.getTextde2().setText(null);
				delete.getTextde3().setText(null);
				delete.getTextde4().setText(null);
				message2.setText(null);
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(delete.getBackd().getText())) {
				// here we close the stage number four which is the delete stage and we open the interface stage .
				// we set all textfields null , and set the error message null.
				stage1.close();
				stage4.close();
				delete.getCombod().setValue(" ");
				delete.getgridde().getChildren().removeAll(delete.getTextde4(), delete.getSearch2());
				delete.getTextde1().setText(null);
				delete.getTextde2().setText(null);
				delete.getTextde3().setText(null);
				delete.getTextde4().setText(null);
				store.out.setText(null);
				store.out1.setText(null);
				store.out2.setText(null);
				message2.setText(null);
				stage1.setScene(scene1);
				stage1.show();
			} else if (e.getSource().equals(delete.getCombod())) {
				// if the user choose the not brand option only the search button will appear.
				if (delete.getCombod().getValue().equals("Not Brand")) {
					delete.getgridde().getChildren().removeAll(delete.getTextde4(), delete.getSearch2());
					delete.getgridde().add(delete.getSearch2(), 3, 1);
					stage4.setScene(scene4);
					stage4.show();

				} else if (delete.getCombod().getValue().equals("Brand")) {
					// if the user click brand so the search and the textfield for the brand will appear.
					delete.getgridde().getChildren().removeAll(delete.getTextde4(), delete.getSearch2());
					delete.getgridde().add(delete.getSearch2(), 3, 1);
					delete.getgridde().add(delete.getTextde4(), 2, 1);
					stage4.setScene(scene4);
					stage4.show();
				} 
			}

			else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(delete.getSearch2().getText())) {
				// if the user click search and the textfields are null will throw and exception.
				// this exception is unchecked.
				try {
				if (delete.getCombod().getValue().equals("Not Brand")) {
					//if the item is not brand so we delete this item by calling:
					// we call the delete method inside the inventory class.
					//so first we take the quantity and price for the item .
					// but before delete them we converte them to string and then we delete them .
					store.update(delete.getTextde1().getText(), 0);
					delete.getTextde3().setText(String.valueOf(store.getPrice(delete.getTextde1().getText())));
					delete.getTextde2().setText(String.valueOf(store.getQuantity(delete.getTextde1().getText())));
				} else if (delete.getCombod().getValue().equals("Brand")) {
					store.update(delete.getTextde4().getText(), delete.getTextde1().getText(), 0);
					delete.getTextde2().setText(String
							.valueOf(store.getQuantity(delete.getTextde4().getText(), delete.getTextde1().getText())));
					delete.getTextde3().setText(String
							.valueOf(store.getPrice(delete.getTextde4().getText(), delete.getTextde1().getText())));
				}
			}
			
			catch(Exception ex) {
				// if the user click delete or search and the textfields are empty so will throw an unchecekd exception.
				//if the user input string in the price or quantity textfield will throw an unchecked exception.
				System.out.println("Error: Empty String !");
				
			}
			}

			else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(delete.getDelete().getText())) {
				// if the user click delete so item will  delete!!
				try {
					if (delete.getCombod().getValue().equals("Not Brand")) {
						store.delete(delete.getTextde1().getText());
						message2.setTextFill(Color.GREEN);
						message2.setFont(Font.font("Times new romain", FontWeight.BOLD, FontPosture.ITALIC, 12));
						message2.setText("The Delete of type " + delete.getTextde1().getText() + " is deleted!!");
					} else if (delete.getCombod().getValue().equals("Brand")) {
						store.delete(delete.getTextde1().getText(), delete.getTextde4().getText());
						message2.setTextFill(Color.GREEN);
						message2.setFont(Font.font("Times new romain", FontWeight.BOLD, FontPosture.ITALIC, 12));
						message2.setText("The Delete of type " + delete.getTextde1().getText() + ", the brand :"
								+ delete.getTextde4().getText() + " is Deleted!!");
					}
					else {
						//Here if the user select delete and they dont input the brand or nothing 
						// they don't input any information!
						message2.setTextFill(Color.RED);
						message2.setFont(Font.font("Times new romain", FontWeight.BOLD, FontPosture.ITALIC, 16));
						message2.setText(" Error :There's is no type to delete ! \n Please Click Cancel ! \n  Choose option and fill the texts!");
						
					}
				}

				catch (Exception ex) {
					System.out.println("Error : The string are empty!!");

				}
			}

			else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(view.getBt4().getText())) {
				// we use stockreport to print the items and the total .
				// we have two ways to print !!
				store.stockReport();
				stock.getGd().getChildren().removeAll(stock.getTextfield(), stock.getExport(), stock.getTextarea());
				stage5.setScene(scene5);
				stage5.setTitle("Stock Report");
				stage5.show();
				stage1.close();

			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(stock.getExport().getText())) {
				// if the user click export button so all informations will appear in file that the user input it !
				try {
					// we put try because if we dont write the file name in the text field will gave an exception .
					// we use the fileWriter to write all the informations in the file.
					// in the fileWriter if the file does not exsists so writer will create it no problem!
					FileWriter f = new FileWriter(stock.getTextfield().getText());
					f.append(store.out5.getText());
					f.close();
				} catch (IOException e1) {
					System.out.println("error !! : please enter the file name \n if the file does not exsists the filewriter will create it !");
				}
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(stock.getMainpage().getText())) {
				// main page will take you to first stage .
				// we close the stage 5 .
				stock.getTexta().setSelected(false);
				stock.getTextarea().clear();
			    stock.getTextfield().setText(null);
				stock.getExpfile().setSelected(false);
				stock.getGd().getChildren().removeAll(stock.getTextarea(), stock.getTextfield(), stock.getExport());
				stage1.close();
				stage5.close();
				stage1.setScene(scene1);
				stage1.show();
			}
			if (stock.getTexta().isSelected()) {
				// if the user click textarea so all the informations will appear inside the textarea!
				stock.getGd().getChildren().removeAll(stock.getTextarea(), stock.getTextfield(), stock.getExport());
				stock.getGd().add(stock.getTextarea(), 1, 7);
				// stock.getTextarea().setText(store.out3.getText());
				stock.getTextarea().setText(store.out5.getText());

			} else {
				// if the user unclicked the textarea the information will be inside the textarea but will not disappear.
				stock.getTextarea().clear();
				stock.getGd().getChildren().remove(stock.getTextarea());

			}

			if (stock.getExpfile().isSelected()) {
				// if we click the export option so we click or input the name of the file.
				// if the file is exists or not the fileWriter will create it .
				// but if the user does not entered the name of the file will throw an exception !!
				stock.getGd().getChildren().removeAll(stock.getTextarea(), stock.getTextfield(), stock.getExport());
				stock.getGd().add(stock.getTextfield(), 0, 2);
				stock.getGd().add(stock.getExport(), 0, 3);
			} else {
				// stock.getTextfield().setText(null);
				stock.getTextarea().setText(store.out5.getText());
				stock.getGd().getChildren().removeAll(stock.getTextfield(), stock.getExport());
			}
			if (stock.getExpfile().isSelected() && stock.getTexta().isSelected()) {
				// if the both options is selected so will appear information in the file and in the textarea.
				stock.getTextfield().setText(null);
				stock.getGd().getChildren().removeAll(stock.getTextarea(), stock.getTextfield(), stock.getExport());
				stock.getGd().getChildren().addAll(stock.getTextarea(), stock.getTextfield(), stock.getExport());
				stock.getTextarea().setText(store.out5.getText());
			} else if (e.getSource() instanceof Button
					&& ((Button) e.getSource()).getText().equals(view.getBt5().getText())) {
				// if the user click on the readfile so first we use the filechooser.
				//we use filechooser to make the user choose his own filw any file he want from disktop!
				
				FileChooser file = new FileChooser();
				File file1 = file.showOpenDialog(stage1);
				// we open the desktop!
				try (Scanner scanner = new Scanner(file1)) {
				// we use scanner to read from the file
					while (scanner.hasNextLine()) {
						String s = scanner.nextLine();
						String[] tokens = s.split(" ");
						// we use split to take part part from the line ! we split by use (space)!
						// we store the words in tokens string array !
						//I suppose that the first tokens the type name.
						// and the second tokens is the quantity.
						//finally , i suppose the third is the price .
						if (tokens.length == 3) {
							// tokens equals 3 that's mean that the item is type and price and quantity only !
							int q1 = Integer.parseInt(tokens[1]);
							double p1 = Double.parseDouble(tokens[2]);
							// we add the item to the store!
							store.newItem(tokens[0], q1, p1);

						} else if (tokens.length == 4) {
							// tokens equals 4 that's mean that the item is brand so we have 4 fields.
							// i suppose here the tokens 0 is the type .
							//and the tokens 1 is the brand .
							// the tokens 2 quantity. 
							//the tokens 3 price .
							int q2 = Integer.parseInt(tokens[2]);
							double p2 = Double.parseDouble(tokens[3]);
							// we add the brand to the inventory!
							store.newItem(tokens[0], tokens[1], q2, p2);
                           
                           
						}
					
					}
					//checked exception 
				} catch (Exception ex) {
					System.out.println("You are read from null ");

				} 
				
		}

	}
}
}

// Project Is End Finallyyyyyyy!!!!
// Name:Ehab maher elia ellati.
//Student Id :1211
	
	
	
