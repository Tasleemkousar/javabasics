package streams;

import java.io.FileInputStream;

public class FileInputStreamExample {

	//read single character

	public static void main(String[] args) {
      
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\lenovo\\Desktop\\javainputoutput\\testout.txt");
			int i = fin.read();
			System.out.println((char)i);
			
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
					
		}
	}

}
