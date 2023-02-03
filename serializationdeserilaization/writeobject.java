package in.co.serializationdeserilaization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeobject {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\77240\\Desktop\\sumit.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		marksheet m = new marksheet();
		m.name = "sumit";
		m.physics = 56;
		m.chemistry = 99;
		m.maths = 56;
		
		
		out.writeObject(m);
		out.close();
		file.close();
	}

}
