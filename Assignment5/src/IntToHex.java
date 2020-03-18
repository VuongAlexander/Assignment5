import java.util.Scanner;

public class IntToHex {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Hexadecimal Value is " + Integer.toHexString(num));

	}
}
