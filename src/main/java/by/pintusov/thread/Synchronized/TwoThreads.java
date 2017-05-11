package by.pintusov.thread.Synchronized;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class TwoThreads {
	public static int counter = 0;
	private static Logger logger = Logger.getLogger(TwoThreads.class);

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		new Thread () {
			public void run () {
				synchronized (stringBuilder) {
					do {
						stringBuilder.append("A");
						System.out.println(stringBuilder);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						logger.error(e);
					}
					} while (TwoThreads.counter++ < 2); // end of synchronizing
				}
			}
		}.start();
		new Thread () {
			public void run () {
				synchronized (stringBuilder) {
					while (TwoThreads.counter++ < 6) {
						stringBuilder.append("B");
						System.out.println(stringBuilder);
					}
				}
			} // end of synchronizing
		}.start();
	}
}
