package ftmk.rmi.sensor.manager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.HashMap;

import ftmk.rmi.sensor.TemperatureSensor;


/**
 * 
 * This class manages the temperature from the sensor.
 * @author User
 *
 */
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor{
	
	
	public TemperatureSensorManager() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override 
	public HashMap<String,Integer> getTemperature() throws RemoteException{
		
		HashMap<String,Integer> happy=new HashMap<String,Integer>();
		
		
		

		happy.put("MONDAY", 32);
		
		happy.put("TUESDAY", 31);
		
		happy.put("WEDNESDAY", 33);
		
		happy.put("THURSDAY ", 35);
		
		happy.put("FRIDAY", 36);
		
		happy.put("SATURDAY", 33);
		
		happy.put("SUDAY ", 33);
		
		
		return happy;
	}

	
	public float getAverageTemprature() throws RemoteException {
		
	
   
		
		float sum = 0.0f;
		for (float f : getTemperature().values()) {
		    sum += f;
		}
		
		//Computing Average Temeprature
	 float average=sum/7;
	 
	 return average;
	}
}
