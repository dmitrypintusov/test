package by.pintusov.thread.concurrent;

import org.apache.log4j.Logger;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class RunBlocking {
	private static Logger logger = Logger.getLogger(RunBlocking.class);

	public static void main(String[] args) {
		final BlockingQueue <String> queue = new ArrayBlockingQueue<String>(2);
		new Thread () {
			public void run () {
				for (int i = 1; i < 6; i++) {
					try {
						queue.put("Java " + i); //added 5
						System.out.println("Element " + i + " added.");
					} catch (InterruptedException e) {
						logger.error(e);
					}

				}
			}
		}.start();

		new Thread() {
			public void run () {
				while (!queue.isEmpty()) {
					try {
						Thread.sleep(1_000);
						// Taking from queue
						System.out.println("Element " + queue.take() + " took.");
					} catch (InterruptedException e) {
						logger.error(e);
					}
				}
			}
		}.start();
	}
}
