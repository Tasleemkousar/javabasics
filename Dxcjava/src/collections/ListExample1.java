package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
       List<String> list = new ArrayList<String>();
       list.add("mango");
       list.add("apple");
       list.add("banana");
       list.add("grapes");
       for(String fruit:list)
    	   System.out.println(fruit);
	}

}
