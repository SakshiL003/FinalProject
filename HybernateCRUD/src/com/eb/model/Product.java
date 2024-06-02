package com.eb.model;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Pid;
	
	@Column(name="Pname")
	private String Pname;
	
	@Column(name="Quantity")
	private int Quantity;
	
	@Column(name="Price")
	private int Price;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Product(String pname, int quantity, int price) {
		super();
		Pname = pname;
		Quantity = quantity;
		Price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 
	
	

}
