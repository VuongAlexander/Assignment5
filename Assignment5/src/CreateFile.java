import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class CreateFile {
	public static void main(String[]args) throws IOException {
		File file = new File("command_line_input.txt");
		System.out.println("Enter a string: ");
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(in.hasNext()) {
		    String s1 = in.next();
		    list.add(s1);
		    if(s1.equals("@q")) {
		        break;
		    }
		}
		FileWriter writer = new FileWriter(file);
		for(String str: list) {
			try {
				writer.write(str + "\n");
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		writer.close();
		in.close();
		System.out.println("Text file has been updated");
	}
}