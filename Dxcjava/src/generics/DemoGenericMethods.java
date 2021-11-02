package generics;

public class DemoGenericMethods {
	public static <E> void printArray(E[ ] elements) {
		for(E element:elements) {
			System.out.println(element );
		}
		System.out.println();
	}

	public static void main(String[] args) {
     Integer[] intArray = {10,20,30,40,50};
     Character[] charArray = { 'a','b','c','d'};
     
     System.out.println("printting integer array");
     printArray(intArray);
     
     System.out.println("printing character array");
     printArray(charArray);
	}

}

