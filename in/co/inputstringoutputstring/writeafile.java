package in.co.inputstringoutputstring;

import java.io.FileWriter;
import java.io.IOException;

public class writeafile {
	public static void main(String[] args) throws IOException {

		FileWriter out = new FileWriter("D:\\NEWFOLDER\\write.txt");
		out.write('a');
		out.write('\n');
		out.write("this is line one");
		out.write("this is line two");
		out.close();
		System.out.println("done");
	}

}
