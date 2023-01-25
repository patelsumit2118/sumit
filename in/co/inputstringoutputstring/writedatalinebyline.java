package in.co.inputstringoutputstring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writedatalinebyline {
	public static void main(String[] args) throws IOException {
		FileWriter o = new FileWriter("C:\\Users\\77240\\Documents\\Msn.txt");
		PrintWriter pw = new PrintWriter(o);

		for (int i = 0; i < 5; i++) {
			pw.println(i + ":line");
		}
		pw.close();
		o.close();

		System.out.println("done");

		FileReader fe = new FileReader("C:\\Users\\77240\\Documents\\Msn.txt");
		BufferedReader br = new BufferedReader(fe);

		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();

		}
		br.close();

	}

}
