package Activity;

public class Product {
	private int productid;
	private String productName;
	private double price;
	 
	 

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + "]";
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}else {
			System.out.println("Invalid Price!");
			this.price = 0;
		}
		 
	}
	 

}
