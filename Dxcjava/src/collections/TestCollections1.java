package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections1 {

	public static void main(String[] args) {
      ArrayList<String>list= new ArrayList<String>();
      list.add("tasleem");
      list.add("sindhu");
      list.add("sindhuja");
      list.add("sharmila");
      list.add("sujnan");
      
      Iterator itr=list.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      }
      
	}


