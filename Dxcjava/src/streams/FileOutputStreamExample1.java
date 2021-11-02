package streams;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {
      
		//write string
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\javainputoutput\\testout.txt");
			String s = "welcome to javaTpoint";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
