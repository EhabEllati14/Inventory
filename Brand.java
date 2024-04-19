package application;

public class Brand extends Item {
	// this class have his own methods and item class method because this calls
	// inherited item class
	private String brand;

	public Brand() {

	}

	public Brand(String brand, String type) {
		super(type);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
}