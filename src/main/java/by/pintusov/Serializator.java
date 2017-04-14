package by.pintusov;


import org.apache.log4j.Logger;

import java.io.*;

/**
 * Project: Test
 * Created by: USER
 * Date: 07.04.17.
 */
public class Serializator {
	private static Logger logger = Logger.getLogger(Serializator.class);

	public boolean serialization (Vehicle vehicle, String fileName) {
		boolean flag = false;
		File file = new File(fileName);
		ObjectOutputStream objectOutputStream = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			if (file != null) {
				objectOutputStream = new ObjectOutputStream (fileOutputStream);
				objectOutputStream.writeObject(vehicle);
				flag = true;
			}
		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (NotSerializableException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} finally {
			try {
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
			} catch (IOException e) {
				logger.error(e);
			}
		}
		return flag;
	}

	public Vehicle deserialization (String fileName) throws InvalidObjectException {
		File file = new File(fileName);
		ObjectInputStream inputStream = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			inputStream = new ObjectInputStream(fileInputStream);
			Vehicle vehicle = (Vehicle) inputStream.readObject();
			return vehicle;
		} catch (ClassNotFoundException e) {
			logger.error(e);
		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (InvalidClassException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				logger.error(e);
			}
		}
		throw new InvalidObjectException("Object not deserialized.");
	}
}
