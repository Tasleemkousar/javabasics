package abstraction;

public class Wiring {

	public static void main(String[] args) {
 
		ISwitchBoardListener sListener = new HavellsAppliances();
		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree(12);
		sListener.switchFour();
		
	}

}
