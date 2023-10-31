package entities;

public class Product {

	private String name;
	private double price;
	private String email;
	private int room;

	
	

	public Product(String name, String email, int room) {
		super();
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public Product(String name, double price) {

		this.name = name;
		this.price = price;
	}

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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	

}