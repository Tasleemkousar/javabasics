package dependency.injection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrameworkFactory {
	/*public static void main(String[] args) {
		Service serviceb = new*/
	public static void main(String[] args) throws IOException{
			ServiceFactory servicefactory = new ServiceFactory();
			System.out.println("Enter the name of the plan for which the bill will be generated:");
			BufferReader br = new BufferReader(new InputStreamReader(System.in));
			String ServiceName = br.readLine();
			
			Service service = serviceFactory.getService(serviceName);
			
			Service serviceb = service;
			/*ServiceB();*/
			Client client = new ClientA(serviceb);
			client.doSomething();
		}
}