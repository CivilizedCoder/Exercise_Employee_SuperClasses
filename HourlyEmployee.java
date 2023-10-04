
public class HourlyEmployee extends Employee{
	
	private double hourlyRate;
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double calculatePay() {
		return hourlyRate*getHours();
		
	}
}
