package abstraction;

public class SolarAppliances implements ISwitchBoardListener {
	
	public void switchOne() {
		System.out.println("solar light is on");
	}
	
	public int switchTwo() {
		System.out.println("solar ac is on");
		return 22;
	}

	public boolean switchThree( int type) {
		System.out.println("solar LED is on");
		return false;
	}
	
	public void switchFour() {
		System.out.println("solar tubelight is on");
	}

	
}
