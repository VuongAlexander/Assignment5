/*Define and implement class StudentTest.
 * This student will also be taking 4 courses, which you specified in the definition of the Student class. 
 * Create another instance of Student class, which should be a clone of the first student. 
 * Use printInfo() method call to print the values of both instances of Student. 
 * Save this class and its definition into a file named StudentTest.java.
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		Student j = new Student("John", "Smith", 3.60f, "Computer Science Major", "School of Computer Science Department", 20);
		Student j1 = new Student("John", "Smith", 3.60f, "Computer Science Major", "School of Computer Science Department", 20);
		System.out.println(j.printInfo());
		System.out.println();
		System.out.println(j1.printInfo());	}
	
}
