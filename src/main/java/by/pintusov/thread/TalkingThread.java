package by.pintusov.thread;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */

public class TalkingThread extends Thread {
	private static Logger logger = Logger.getLogger(TalkingThread.class);

	@Override
	public void run() {
		for (int i = 0; i<10; i++) {
			System.out.println("Talking " + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				logger.error(e);
			}
		}
	}
}
