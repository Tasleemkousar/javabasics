package unittest;

import junit.framework.TestCase;

public class BmwTest extends TestCase{
	public void testAdd() {
		int expected=30;
		int actual=BmwFlyingCar.add(15,15);
		assertEquals(expected,actual);
		
	}
	class BmwFlyingCar{
		static int add(int x,int y) {
			int actual = x+y;
			return actual;
		}
	}

}
