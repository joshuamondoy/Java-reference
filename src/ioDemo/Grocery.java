package ioDemo;

public class Grocery {

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Grocery(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Grocery() {
		// no args
		// empty
	}

	@Override
	public String toString() {
		return "Name=" + name + ", price=" + price;
	}


}
