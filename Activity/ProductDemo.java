package Activity;

public class ProductDemo {

	public static void main(String[] args) {
		
		Product pen=new Product();
		pen.setPrice(-1);
		pen.setProductid(123);
		pen.setProductName("Cello");
		
		pen.getPrice();
		pen.getProductName();
		pen.getProductid();
		System.out.println(pen);// TODO Auto-generated method stub

	}

}
