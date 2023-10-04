
public class Employee {

	private int hoursWorked;
	private String name;
	
	public int getHours() {
		return hoursWorked;
	}
	public void setHours(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void resetHours() {
		this.hoursWorked = 0;
	}
	public double calculatePay() {
		return 0;
	}
}
