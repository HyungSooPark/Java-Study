package silsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	//pName setter / getter
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPName() {
		return pName;
	}
	
	//price setter / getter
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//brand setter / getter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName+", "+price+", "+brand;
	}
}
