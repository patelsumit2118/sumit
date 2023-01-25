package in.co.inputstringoutputstring;

import java.io.FileReader;
import java.io.IOException;

public class readtextfile {
	public static void main(String[] args) throws IOException {

		FileReader in = new FileReader('C:\Users\77240\Desktop'\\'abc.txt');

		int ch = in.read();
		while (ch != -1) {
			System.out.println((char) ch);
			ch = in.read();

		}
		in.close();

	}
}
