package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("cricket");
      list.add("badminton");
      list.add("football");
      list.add("shuttle");
      Iterator itr = list.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
	}

}
