package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;

public interface TemperatureSensor extends Remote {

	/**
	 * This interface represents temperature sensor
	 * @return
	 * @throws RemoteException
	 */
	
	
	
	public HashMap<String, Integer> getTemperature() throws RemoteException;
	public float getAverageTemprature() throws RemoteException;
	
	
}
