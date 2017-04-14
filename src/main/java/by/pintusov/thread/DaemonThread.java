package by.pintusov.thread;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */
public class DaemonThread extends Thread {
	private static Logger logger = Logger.getLogger(DaemonThread.class);

	@Override
	public void run() {
		try {
			if (isDaemon()) {
				System.out.println("старт потока-демона");
				Thread.sleep(10_000); // заменить параметр на 1
			} else {
				System.out.println("старт обычного потока");
			}
		} catch (InterruptedException e) {
			logger.error(e);
		} finally {
			if (!isDaemon()) {
				System.out.println("завершение обычного потока");
			} else {
				System.out.println("завершение потока-демона");
			}
		}
	}
}
