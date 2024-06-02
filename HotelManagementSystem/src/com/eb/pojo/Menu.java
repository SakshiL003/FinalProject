package com.eb.pojo;

public class Menu {
	
	private int menuId;
	private String menuName;
	private String menuType;
	private int prise;
	private int quantity;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(int menuId, String menuName, String menuType, int prise, int quantity) {
		super();
		//this.menuId = menuId;
		this.menuName = menuName;
		this.menuType = menuType;
		this.prise = prise;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "menu [menuId=" + menuId + ", menuName=" + menuName + ", menuType=" + menuType + ", prise=" + prise
				+ ", quantity=" + quantity + "]";
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
