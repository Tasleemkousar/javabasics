package Threads;

public class NodueProcess {
	public static void main(String[] args) {
		
	
	FeeThread feethread = new FeeThread();
	feethread.start();
	OfficeBoy ramu = new OfficeBoy();
	ramu.start();

	}
	private static void OldSequentialWay() {
	
	try {
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
	}
    catch(Exception e) {
    	
    }
 }
}
