package Model;

import javax.management.loading.PrivateClassLoader;

public class Product {
	private String id;
	private String name;
	private String type;
	private int price;

	public Product() {
		super();
	}

	public Product(String id, String name, String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String productId) {
		this.id = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}