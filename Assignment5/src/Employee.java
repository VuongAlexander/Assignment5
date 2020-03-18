/*Define and implement class Employee. 
 * Implement method computePay() in this class. 
 * This method should accept an integer number of hours the employee worked as an input argument 
 * and return a floating point value indicating the pay the employee earned. 
 * If the number of hours is invalid (e.g. a negative number) 
 * this method should throw NumberFormatException. 
 * If the number of hours is over 40 then this method should throw a 
 * custom exception named TooManyHoursWorkedException. 
 * Remember that you will have to define your own exception class for this. 
 * Save this class and its definition into a file named Employee.java. */
public class Employee {
	String firstName;
	String lastName;
	int id;
	float hourlyPay;
	
	public Employee(String firstName, String lastName, int id, float hourlyPay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.hourlyPay = hourlyPay;
	}
	
	public float computePay(int hours) throws TooManyHoursWorkedException{
		if(hours < 0) {
			throw new NumberFormatException("The number of hours is invalid.");
		}
		else if(hours > 40) {
			throw new TooManyHoursWorkedException("Hours exceed 40.");
		}
		else{
			hourlyPay = hourlyPay * hours;
		}	
		return hourlyPay;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public float getHourlyPay() {
		return hourlyPay;
	}
}
