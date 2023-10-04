
public class PartTimeEmployee extends HourlyEmployee{

	private int hourLimit;
	
	public void setHourLimit(int hourLimit) {
		this.hourLimit = hourLimit;
		
	}
	
	public void addHours(int hours) {
		if (hours <= hourLimit) {
			setHours(hours);
		}
		else {
			setHours(hourLimit);
		}
	}
}
