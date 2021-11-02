package dependency.injection;

public class ServiceFactory {
	
	public Service getService(String servicename) {
		if(serviceName == null) {
			return null;
		}
		if(serviceName.equalsInoreCase("AIRTEL")) {
			return new AirtelService();
		}
		else if(serviceName.equalsIgnoreCase("VODA")) {
			return new VodafoneService();
		}
		else if(serviceName.equalsIgnoreCase("JIO")) {
			return new JioService();
		}
		return null;
	}

}
