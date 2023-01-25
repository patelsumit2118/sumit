package in.co.inputstringoutputstring1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class bufferreder {
	public static void main(String[] args)throws IOException {
		FileReader a = new FileReader("C:\\Users\\77240\\Desktop\\abc.txt");
		BufferedReader b = new BufferedReader(a);
		
		String line = b.readLine();
		while(line!=null) {
			System.out.println(line);
			line= b.readLine();
		}
		b.close();
		
		
		
		
				
		
	}

}
