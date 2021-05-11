package nLayerProject.entities.concretes;

import nLayerProject.entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	
	public Product () {
		
	}

	public Product(int id, int categoryId, String name, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameString) {
		this.name = nameString;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}