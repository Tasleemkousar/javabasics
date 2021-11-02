package streams;

import java.io.FileInputStream;

public class FileInputStreamExample1 {

	public static void main(String[] args) {
        
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\lenovo\\Desktop\\javainputoutput\\testout.txt");
			int i = 0;
			while((i=fin.read())!=-1) {
				System.out.println((char)i);
			}
			fin.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		   }
		 }
	
	}





