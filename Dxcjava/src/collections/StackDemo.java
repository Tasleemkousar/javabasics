package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
       Stack<String> names = new Stack<>();
       names.push("tasleem");
       names.push("ramya");
       System.out.println(names);
       System.out.println(names.pop());
       System.out.println(names);
	}

}
