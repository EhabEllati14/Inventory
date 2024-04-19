package application;

public class Item implements Comparable<Item> {
	// the class item implement the comparable because we use compare to method !
	// we put all datafields private , so we need setters and getters!
	private String type;
	private int quantity;
	private double price;

	public Item() {
		// default Constructor (Without arguments).
	}

	public Item(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Item setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public Item setPrice(double price) {
		this.price = price;
		return this;
	}

	public Item update(int qtyIncrease) {
		// increase Quantity
		this.quantity += qtyIncrease;
		return this;
	}

	public Item update(double adjustmentFactor) {
		// increase price
		this.price = price + price * adjustmentFactor * 1;
		return this;

	}

	@Override
	public int compareTo(Item o) {
		// compare between two prices this return only negative or positive or zero only
		return (int) ((this.getPrice()) - (((Item) o).getPrice()));
	}

}
