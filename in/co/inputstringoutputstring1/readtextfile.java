package in.co.inputstringoutputstring1;

import java.io.FileReader;
import java.io.IOException;

public class readtextfile {
	public static void main(String[] args)throws IOException {
		
		FileReader r = new FileReader("C:\\Users\\77240\\Desktop\\abc.txt");
		int ch = r.read();
		while(ch!=-1) {
			System.out.println((char)ch);
			ch= r.read();
			
		}
		r.close();
			
		
	}
	

}
