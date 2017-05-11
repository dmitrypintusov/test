package by.pintusov.thread.Synchronized;

import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class SynchroRun {
	private static Logger logger = Logger.getLogger(SynchroRun.class);

	public static void main(String[] args) {
		Resource resource = null;
		try {
			resource = new Resource("data//data.txt");
			SyncThread st1 = new SyncThread("First", resource);
			SyncThread st2 = new SyncThread("Second", resource);
			st1.start();
			st2.start();
			st1.join();
			st2.join();
		} catch (IOException e) {
			logger.error(e);
		} catch (InterruptedException e) {
			logger.error(e);
		} finally {
			resource.close();
		}
	}
}
