package constructor;

public class Customer {
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public Customer() {
		//System.out.println("Defalut is called");
//		this.id=id;
//		this.name=name;
//		this.city=city;
	}
	public Customer(int id) {
		this.id=id;
	}
	public Customer(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
