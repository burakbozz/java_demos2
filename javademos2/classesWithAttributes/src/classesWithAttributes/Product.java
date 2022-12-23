package classesWithAttributes;

public class Product {
	//attribute,field
	private int id;
	private String name;
	private String description;
	private double price;
	private int StockAmount;
	private String renk;
	private String kod;
	
	public Product(int id ,String name, String description,double price, int stockAmount,String renk) {
		System.out.println("yapýcý method çalýþtý.");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.StockAmount = stockAmount;
	}
	public Product() {
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return StockAmount;
	}
	public void setStockAmount(int stockAmount) {
		StockAmount = stockAmount;
	}
	
	
	public String getKod() {
		return this.name.substring(0, 1) + id;
	}



	public String getRenk() {
		return renk;
	}



	public void setRenk(String renk) {
		this.renk = renk;
	}


	
	
	
	
	
	
	
}
