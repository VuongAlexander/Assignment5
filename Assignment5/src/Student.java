/*Define and implement class Student. 
 * For example, variable name “cs151” refers to an object of type Course with the following details: 
 * CS151, Object Oriented Design and Programming, CS, 6:00pm, Tue. 
 * You might declare it as:
 * private Course cs151; 
 * Implement a method called printInfo(), which will print the values of the Student instance. 
 * Save this class and its definition into a file named Student.java.
 */

public class Student{
	private Course cs151;
	private Course cs149;
	private Course cmpe181;
	private Course cmpe189; 

	String firstName;
	String lastName;
	float gpa;
	String major;
	String department;
	int age;
	
	
	public Student(String firstName, String lastName, float gpa, String major, String department, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.age = age;
	}
	
	public Course cs151() {
		cs151.department = "CS151";
		cs151.description = "Operating Systems";
		cs151.name = "CS";
		cs151.time = "1:30pm";
		cs151.weekday = "Mon.";
		return cs151;
	}
	
	public Course cs149() {
		cs149.department = "CS149";
		cs149.description = "Object Oriented Design and Programming";
		cs149.name = "CS";
		cs149.time = "6:00pm";
		cs149.weekday = "Tue.";
		return cs149;
	}
	
	public Course cmpe181() {
		cmpe181.department = "CMPE181";
		cmpe181.description = "IOT Platforms";
		cmpe181.name = "CMPE";
		cmpe181.time = "12:00pm";
		cmpe181.weekday = "Wed.";
		return cmpe181;
	}

	public Course cmpe189() {
		cmpe189.department = "CMPE189";
		cmpe189.description = "Special Topics in CMPE";
		cmpe189.name = "CMPE";
		cmpe189.time = "1:30pm";
		cmpe189.weekday = "Thur.";
		return cmpe189;
	}
	
	public String printInfo() {
		return String.format("%s %s\nGPA: %.2f, Age: %d\nMajor: %s\nDepartment: %s", 
				firstName, lastName, gpa, age, major, department);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}	

	public float getGpa() {
		return gpa;
	}
	

	public String getMajor() {
		return major;
	}	

	public String getDepartment() {
		return department;
	}

	public int getAge() {
		return age;
	}

}
