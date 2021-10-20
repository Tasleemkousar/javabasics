package objectclass;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("enter the number:");
     int num=scan.nextInt();
     findOddEven(num);
	}
	public static void findOddEven(int num) {
		if(num%2==0)
			System.out.println(num+"is even");
		else
			System.out.println(num+"is odd");
	}

}
