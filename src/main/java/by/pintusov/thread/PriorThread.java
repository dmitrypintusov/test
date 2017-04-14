package by.pintusov.thread;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */
public class PriorThread extends Thread {
	private static Logger logger = Logger.getLogger(PriorThread.class);

	public PriorThread (String name) {
		super (name);
	}

	@Override
	public void run() {
		for (int i = 0; i< 30; i++) {
			System.out.println(getName() + " " + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				logger.error(e);
			}
		}
	}
}
