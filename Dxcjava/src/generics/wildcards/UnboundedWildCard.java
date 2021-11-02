package generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {
	
	public static void display(List<?>list)
	{
		for(Object o:list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
      
		List<Integer>l1 = Arrays.asList(1,2,3);
		System.out.println("displaying the integer values");
		display(l1);
		
		List<String0>l2 = Arrays.asList("one","two","three");
		System.out.println("displaying the string values");
		display(l2);
		
	}

}
