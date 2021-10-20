package getsetstatic;
import getsetstatic.Util;

public class Student1 {
	
	String name; //partition 
	int age;
	
	/**
	 * default constructor
	 */
	public Student1() {
		System.out.println("First: "+this.age+" "+this.name);
	}
	
	public Student1(String name) {
		this.name = name;
		System.out.println("Second: "+this.age+" "+this.name);
	}
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age+2;
		this.age = Util.incrementByTen(age);
		System.out.println("Third: "+this.age+" "+this.name);
	}

	static String COLLEGE_NAME = "IIT";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
