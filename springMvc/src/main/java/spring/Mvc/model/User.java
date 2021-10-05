package spring.Mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name="user_id")
	private int id;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="price")
	private String price;
	
	@Column(name="menu_id")
	private String menu_id;
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", productName=" + productName + ", price=" + price + ", menu_id=" + menu_id + "]";
	}


	



}
