import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TemperatureSensor;
import ftmk.rmi.sensor.manager.TemperatureSensorManager;


/**
 * This class Represents serverSide Application using RMI
 * @author User
 *
 */

public class TemperatureServerRMIApp {

	
	
	public static void main(String[] args) {
		
	
		
		
		
		try {
			
			//Create Interface Object
			TemperatureSensor sensorJasin=new TemperatureSensorManager();
			
			//Get Registry
			
			Registry rmiRegistry=LocateRegistry.getRegistry();
			
			//Register Interface Object as remote Object
			
			rmiRegistry.rebind("SensorJasin", sensorJasin);
			
			System.out.print("Sensor is successfully Registered in the client");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
