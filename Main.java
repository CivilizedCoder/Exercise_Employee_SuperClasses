
public class Main {
	public static void main(String []args) {
		
		Main m = new Main();
		
		m.go();
		
		}
	public void go() {
		
		PartTimeEmployee jack = new PartTimeEmployee();
		jack.setName("Jack");
		jack.setHourlyRate(10);
		jack.setHourLimit(10);
		jack.addHours(2);
		System.out.println("Jack earned $" + jack.calculatePay());
		
		HourlyEmployee jim = new HourlyEmployee();
		jim.setName("Jim");
		jim.setHourlyRate(15);
		jim.setHours(10);
		System.out.println("jim earned $" +jim.calculatePay());
		
		SalariedEmployee jane = new SalariedEmployee();
		jane.setName("Jane");
		jane.setWeeklySalary(500);
		System.out.println("Jane earned $" +jane.calculatePay());
		
		Employee doug = new Employee();
		doug.setName("Doug");
		doug.setHours(6);
		System.out.println("Doug earned $" +doug.calculatePay());

	}

}
