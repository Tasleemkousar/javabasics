package generics.wildcards;

import java.util.ArrayList;

public class UpperBoundWildCard {
	
	private static Double add(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for(Number n:num)
		{
			sum = sum+n.doubleValue();
		}
		return sum;
		
	}

	public static void main(String[] args) {
       
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		System.out.println("displaying the sum= "+add(l1));
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(30);
		l2.add(40);
		System.out.println("displaying the sum= "+add(l2));
	}

}
