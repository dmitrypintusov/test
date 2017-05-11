package by.pintusov.thread.Synchronized;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class Resource {
	private static Logger logger = Logger.getLogger(Resource.class);
	private FileWriter fileWriter;

	public Resource (String fileName) throws IOException {
		File file = new File (fileName);
		if (file.exists()) {
			fileWriter = new FileWriter(file, true);
		} else {
			file.createNewFile();
			fileWriter = new FileWriter(file, true);
		}
	}

	public synchronized void writing (String str, int i) {
		try {
			fileWriter.append(str + i);
			System.out.println(str + i);

			Thread.sleep((long)(Math.random() * 50));

			fileWriter.append("->" + i + " ");
			System.out.println("->" + i + " ");
		}catch (IOException e) {
			logger.error(e);
		} catch (InterruptedException e) {
			logger.error(e);
		}
	}

	public void close () {
		try {
			fileWriter.close();
		} catch (IOException e) {
			logger.error("Error closing file: " + e);
		}
	}
}
