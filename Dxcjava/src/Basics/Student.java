package Basics;

public class Student {
	String name;
	int age;
	public Student() {}
	/**
	 * 
	 * @param name
	 */
		public Student(String name) {
			this.name=name;
		}
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Student(String name,int age) {
		super();
		this.name=name;
		this.age= age+2;
	}
 static String COLLEGE_NAME = "IIT";
 public String getName() {
}
}