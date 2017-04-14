package by.pintusov.thread;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */
public class JoinThread extends Thread {
	private static Logger logger = Logger.getLogger(JoinThread.class);

	public JoinThread (String name) {
		super(name);
	}

	@Override
	public void run() {
		String nameT = getName();
		long timeout = 0;
		System.out.println("Start thread " + nameT);
		try {
			switch (nameT) {
				case "First":
					timeout = 500;
					break;
				case "Second":
					timeout = 100;
			}
			Thread.sleep(timeout);
			System.out.println("End thread " + nameT);
		} catch (InterruptedException e) {
			logger.error(e);
		}
	}
}
