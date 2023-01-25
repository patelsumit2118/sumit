`11package in.co.inputstringoutputstring1;

import java.io.FileWriter;
import java.io.IOException;

public class writeafile {
	public static void main(String[] args) throws IOException{
		FileWriter out = new FileWriter("C:\\Users\\77240\\Desktop\\sumit.txt");
		out.write("a");
		out.write("/n");
		out.write("this is my file");
		out.write("its my new file");
		out.close();
		System.out.println("done");
		
		
	}

}
