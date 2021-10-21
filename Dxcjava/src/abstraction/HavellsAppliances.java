 package abstraction;

public class HavellsAppliances implements ISwitchBoardListener {
	
	public void switchOne() {
		System.out.println("havells fan is on");
	}
	
	public int switchTwo() {
		System.out.println("havells ac is on");
		return 28;
	}
	
	public boolean switchThree(int tpye) {
		System.out.println("hevellas led is on");
		return false;
	}
	
	public void switchFour() {
		System.out.println("havells tubelight is on");
	}

}
