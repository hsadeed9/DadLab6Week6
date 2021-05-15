import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ftmk.rmi.sensor.TemperatureSensor;

public class TemperatureClientRMApp{
	
	
	/** 
	 * 
	 * This class represents the client side of RMI application
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
		
	
		try {
			
			//Get Registry
			Registry rmiRegistry=LocateRegistry.getRegistry();
			
			//Lookup for the Remote Object
			
			TemperatureSensor remoteSensorJasin=(TemperatureSensor) rmiRegistry.lookup("SensorJasin");
			
			// Invoke method from the remote object
			Map<String,Integer> CurrentTemperature=remoteSensorJasin.getTemperature();
			
		
			System.out.println(CurrentTemperature);
			float averageTemperature=remoteSensorJasin.getAverageTemprature();
			System.out.print("\nThe average Temperature Computed is: "+averageTemperature);
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}