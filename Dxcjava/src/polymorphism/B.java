package polymorphism;

public class B  extends A{
  B(){
	  super();
	  System.out.println("child class constructor invoked");
  }
  {
	  System.out.println("instance intitializer block is invoked");
  }
  
	public static void main(String[] args) {
     B b = new B();
	}

}
