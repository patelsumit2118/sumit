
package in.co.inputstringoutputstring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfilelinebyline {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\77240\\Documents/"+ "i am sumit.txt");
		BufferedReader in = new BufferedReader(file);
		String line = in.readLine();
		while(line!= null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();
		
	}

}
