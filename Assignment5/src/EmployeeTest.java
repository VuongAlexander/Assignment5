class EmployeeTest {
	public static void main(String[]args) throws TooManyHoursWorkedException {
		Employee e = new Employee("John", "Smith", 101, 35);
		try {
			System.out.println("At 40 hours, " + e.firstName + " " + e.lastName + " " + "earns $" + e.computePay(40));
			System.out.println("At 23 hours, " + e.firstName + " " + e.lastName + " " + "earns $" + e.computePay(23));
			System.out.println("At 10 hours, " + e.firstName + " " + e.lastName + " " + "earns $" + e.computePay(10));
			System.out.println("At -5 hours, " + e.firstName + " " + e.lastName + " " + "earns $" + e.computePay(-5));
			System.out.println("At 45 hours, " + e.firstName + " " + e.lastName + " " + "earns $" + e.computePay(45));
		}
		catch(NumberFormatException nfe){
			System.out.println("The number of hours is invalid.");
		}
	}
}
