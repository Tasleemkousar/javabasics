package FactoryMethodPattern;

import java.io.*;

public abstract class Plan {
	
	Protected int rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}

}
