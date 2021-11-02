package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	//write byte

	public static void main(String[] args) {
      try {
    	   FileOutputStream fourpipe = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\javainputoutput\\testout.txt");
    	   fourpipe.write(68);
    	   fourpipe.close();
    	   System.out.println("success");
      }
      
      catch(IOException e) {
    	  e.printStackTrace();
      }
	}

}
