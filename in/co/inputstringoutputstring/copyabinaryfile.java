package in.co.inputstringoutputstring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class copyabinaryfile {
	
	public static void main(String[] args) throws Exception {
		
	
	String source = "E:\\mahadev.jpg";
	String target ="E:\\mahadev2.jpg";
	
	FileInputStream in = new FileInputStream(source);
	FileOutputStream out = new FileOutputStream(target);
	
	
	
	int ch = in.read();
	while(ch!=-1) {
		out.write(ch);
		ch= in.read();
		
	}
	in.close();
	out.close();
	
System.out.println("done");
}
}