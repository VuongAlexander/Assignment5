import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class ReadFileInput {
	public static void readLines(File f) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		fr.close();
		br.close();
	}
	
	public static void main(String[]args) {
		File f = new File("quote.txt");
		try {
			readLines(f);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
