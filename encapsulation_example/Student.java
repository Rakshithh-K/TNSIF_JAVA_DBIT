package encapsulation_example;

public class Student {
	private int sid;
	private String name;
	private float avg;
	
	void display() {
		System.out.println("Student id:"+sid+" Student Name"+name+" Student marks"+avg);
	}
	public int get(int sid) {
		return sid;
		//return name;
		//return avg;
		
	}
	 
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", avg=" + avg + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public void setsid(int sid) {
		this.sid=sid;
		 
	}

}
