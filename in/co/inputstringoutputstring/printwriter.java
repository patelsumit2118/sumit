package in.co.inputstringoutputstring;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriter {
	public static void main(String[] args) throws IOException {

		FileWriter out = new FileWriter("C:\\Users\\77240\\Documents\\sumit.txt");
		PrintWriter pw = new PrintWriter(out);

		for (int i = 0; i < 5; i++) {
			pw.print(i+":line");

		}
		pw.close();
		out.close();
		
		
		System.out.println("done");

	}

}
