
package in.co.serializationdeserilaization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readobject {
	public static void main(String[] args) throws IOException, Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\77240\\Desktop\\sumit.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		
		marksheet m = (marksheet)in.readObject();
		
		
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.physics);
		
		in.close();
		file.close();
		
	}

}
