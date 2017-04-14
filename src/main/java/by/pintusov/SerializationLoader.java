package by.pintusov;

import org.apache.log4j.Logger;

import java.io.InvalidObjectException;

/**
 * Project: Test
 * Created by: USER
 * Date: 07.04.17.
 */
public class SerializationLoader {
	private static Logger logger = Logger.getLogger(SerializationLoader.class);

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Audi");
		System.out.println(vehicle);
		String file = "demo.data";
		Serializator serializator = new Serializator();
		boolean b = serializator.serialization(vehicle, file);
		Vehicle.model = 15;

		Vehicle v1 = null;
		try {
			v1 = serializator.deserialization(file);
		} catch (InvalidObjectException e) {
			logger.error(e);
		}
		System.out.println(v1);
	}
}
