package application;



import java.util.ArrayList;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

//Welcome to my project.
//Let's Start!!

public class Inventory {
	Label out = new Label();
	Label out1 = new Label();
	Label out2 = new Label();
	Text out3 = new Text();
	Text out5 = new Text();
	private String category;
	private ArrayList<Item> inventory = new ArrayList<>();
	// we use arraylist to put inside it objects.
	public Inventory(String category) {
		super();
		this.category = category;
	}

	public void newItem(String type, int quantity, double price) {
		if (inventory.size() == 0) {
			// Here we add the first item because we want to compare with other items.
			inventory.add(new Item(type).setQuantity(quantity).setPrice(price));
		} else {
			int a = findItem(type, true);
			// We send the type to findItem method with true value.
			if (a == -1) {
				// a==-1 mean if this item is not in the arraylist we want to add this item to
				// arraylist.
				inventory.add(new Item(type).setQuantity(quantity).setPrice(price));
			}
		}
	}

	public void newItem(String brand, String type, int quantity, double price) {
		if (inventory.size() == 0) {
			// Here we add the first item because we want to compare with other items.
			// We use method chaning beacuse the setQuantity method is return Item (object).
			inventory.add(new Brand(brand, type).setQuantity(quantity).setPrice(price));
		} else {
			int a = findItem(type, true, brand);
			// We send the type and brand to findItem method with true value.
			if (a == -1) {
				// a==-1 mean if this item is not in the arraylist we want to add this item to
				// arraylist.
				inventory.add(new Brand(brand, type).setQuantity(quantity).setPrice(price));

			}
		}

	}

	public void setQuantity(String type, int quantity) {
		int a = findItem(type, false);
		if (a != -1) {
			// If a!=-1 this mean that if this item is found , set quantity to the value
			// that user input it.
			inventory.get(a).setQuantity(quantity);
		}

	}

	public void setQuantity(String brand, String type, int quantity) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			// If a!=-1 this mean that if this item is found , set quantity to the value
			// that user input it.
			(inventory.get(a)).setQuantity(quantity);
		}

	}

	public void setPrice(String type, double price) {
		int a = findItem(type, false);
		if (a != -1) {
			// If a!=-1 this mean that if this item is found , set price to the value that
			// user input it.
			(inventory.get(a)).setPrice(price);
		}

	}

	public void setPrice(String brand, String type, double price) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			inventory.get(a).setPrice(price);
		}

	}

	public int getQuantity(String type) {
		int a = findItem(type, false);
		if (a != -1) {
			return inventory.get(a).getQuantity();
		}

		return -1;
	}

	public int getQuantity(String brand, String type) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			// here we get the price in the index a so we call the findItem method.
			return inventory.get(a).getQuantity();
		}
		// Else we return zero.

		return 0;
	}

	public double getPrice(String type) {
		int a = findItem(type, false);
		if (a != -1) {
			return inventory.get(a).getPrice();
		}
		// Else we return double.nan that,s mean that this price equal this price not
		// change.
		return Double.NaN;

	}

	public double getPrice(String brand, String type) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			return inventory.get(a).getPrice();
		}

		return Double.NaN;
	}

	public void update(String type, int qtyIncrease) {
		int a = findItem(type, false);
		if (a != -1) {
			// First we call findItem method and then we use method chaning to call update
			// method that return item (object).
			inventory.get(a).update(qtyIncrease);

		}

	}

	public void delete(String type) {
		int a = findItem(type, false);
		if (a != -1) {
			inventory.remove(inventory.get(a));
		}

	}

	public void delete(String type, String brand) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			inventory.remove(inventory.get(a));
		}

	}

	public void update(String brand, String type, int qtyIncrease) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			inventory.get(a).update(qtyIncrease);
		}

	}

	public void update(String type, double adjustmentFactor) {
		int a = findItem(type, false);
		if (a != -1) {
			// We use method chaning with update method.
			inventory.get(a).update(adjustmentFactor);
		}

	}

	public void update(String brand, String type, double adjustmentFactor) {
		int a = findItem(type, false, brand);
		if (a != -1) {
			inventory.get(a).update(adjustmentFactor);

		}

	}

	public int findItem(String type, boolean warningifFound) {
		out.setTextFill(Color.RED.darker());
		out.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		out1.setTextFill(Color.RED.darker());
		out1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		out2.setTextFill(Color.RED.darker());
		out2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		out3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		int index = -1;
		int itemsFound = 0;
		// We use 2 variables to use them in return and when we wants to return or print
		// message.
		for (int i = 0; i < inventory.size(); i++) {
			// We do loop to check all objects inside the arraylist if we have tha same
			// object 2 times.
			if ((type.equals((inventory).get(i).getType()))) {
				index = i;
				++itemsFound;
				// If we have 2 objects are the same content we increment the items found
				// We set the index to the object location of this item.
			}
		}

		if (itemsFound == 0 && warningifFound == false) {
			// if we don't find this item
			out.setText("*Error: Cannot find the Item: " + type);
			out1.setText("*Error: Cannot find the Item: " + type);
			out2.setText("*Error: Cannot find the Item: " + type);

			return index;

		} else if (itemsFound > 0 && warningifFound == true) {
			// If this item is already inside the arraylist
			out.setText("-> ERROR <- \n ->This Type : " + type
					+ ", Is Already Exists ! \n -> Please Click Cancel And Input Another Item !");
			out1.setText("-> ERROR <- \n ->This Type : " + type
					+ ", Is Already Exists ! \n -> Please Click Cancel And Input Another Item !");
			out2.setText("-> ERROR <- \n ->This Type : " + type
					+ ", Is Already Exists ! \n -> Please Click Cancel And Input Another Item !");

			return index;
		} else if (itemsFound > 1 && warningifFound == false) {
			// here if we have one item but this item have some brands
			out.setText("*Error :Found more than one brand of type: " + type);
			out1.setText("*Error :Found more than one brand of type: " + type);
			out2.setText("*Error :Found more than one brand of type: " + type);

		} else {
			// This else method for more one brand because, we have (if) and (else if) so
			// return should be in else .
			return index;
		}

		return -1;

	}

	public int findItem(String type, boolean warningifFound, String brand) {
		out.setTextFill(Color.RED.darker());
		out.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		out1.setTextFill(Color.RED.darker());
		out1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		out2.setTextFill(Color.RED.darker());
		out2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		out3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		int index = -1;
		int itemsFound = 0;
		for (int i = 0; i < inventory.size(); i++) {
			if ((type.equals((inventory.get(i)).getType())) && ((inventory.get(i)) instanceof Brand)
					&& (brand.equals(((Brand) inventory.get(i)).getBrand()))) {
				// we go inside the loop , and check if two items have the same type or brand
				index = i;
				++itemsFound;

			}

		}
		if (itemsFound == 0 && warningifFound == false) {
			// If we don't find this brand
			out.setText("*Error: Cannot find the Item " + brand + " " + type);
			out1.setText("*Error: Cannot find the Item " + brand + " " + type);
			out2.setText("*Error: Cannot find the Item " + brand + " " + type);
			return index;
		} else if (itemsFound > 0 && warningifFound == true) {
			// If this brand is already exists inside the arraylist
			out.setText("-> ERROR <- \n ->This Type : " + type
					+ ", Is Already Exists ! \n -> Please Click Cancel And Input Another Item !");
			out1.setText("-> ERROR <- \n ->This Type : " + type
					+ ", Is Already Exists ! \n -> Please Click Cancel And Input Another Item !");
			out2.setText(" ERROR This Type : " + type
					+ ", Is Already Exists ! \n -> Please Click Cancel And Input Another Item !");
			inventory.remove(inventory.get(index));
		} else {
			return index;
		}
		// We return -1 if this item is not exsits inside the arraylist so in newitem
		// will add this item into arraylist.
		return -1;

	}

	public void stockReport() {

		// We use this method to print all items this method like(toString).
		double sum = 0;
		int g;
		String b = "";
		String h = "";
		for (int i = 0; i < inventory.size(); i++) {
			// We go inside the loop to see or print all the items inside the arraylist.
			int x = inventory.get(i).getQuantity();
			double y = inventory.get(i).getPrice();
			if ((inventory.get(i)) instanceof Brand) {
				g = findItem(inventory.get(i).getType(), false, (((Brand) inventory.get(i)).getBrand()));
				if (g != -1) {
					b = b +  "\n"
							+ ((((Brand) inventory.get(i)).getBrand()) + "  " + (inventory.get(i)).getType()
									+ " in stock- " + (inventory.get(i)).getQuantity() + ",Price: "
									+ (inventory.get(i)).getPrice() + "$ .");

					sum += x * y;

				}

			} else {
				g = findItem(inventory.get(i).getType(), false);
				if (g != -1) {
					h = h +("\n" + (inventory.get(i)).getType() + " in stock- " + (inventory.get(i)).getQuantity()
							+ ",price: " + (inventory.get(i)).getPrice() + "$");

					sum += x * y;

				}
			}

		}
		out5.setText(h + b + "\n" + "The Total price is:  " + sum + "$ .");
	}
}

//Thank you :)
//Name : Ehab maher elia ellati.
//Student Id: 1211567.





//TableView<Book> tableview=new TableView<>();
//ArrayList<Book> data= new ArrayList<Book>();
//data.add( new Book("Java Programmaing","Ahmad Ali",3,true));
//data.add(new Book("C Programmaing","Ali Jaber",6,false));
//data.add(new Book("Web Application Programmaing","Ghada Ali",9,true));
//
//ObservableList< Book > list = FXCollections.observableArrayList(data);
//
//tableview.setItems(list);
//		
//TableColumn tileCol=new TableColumn("Book Title");
//tileCol.setMinWidth(150);
//tileCol.setSortable(false);
//tileCol.setCellValueFactory(new PropertyValueFactory<Book,String>("title"));
//tableview.getColumns().add(tileCol);