package by.pintusov.thread.Synchronized;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class BufferThread {
	private static Logger logger = Logger.getLogger(BufferThread.class);
	static int counter = 0;
	static StringBuilder stringBuilder = new StringBuilder(); //change to StringBuilder

	public static void main(String[] args) throws InterruptedException {
		new Thread () {
			public void run () {
				synchronized (stringBuilder) {
					try {
						while (BufferThread.counter++ < 3) {
							stringBuilder.append("A");
							System.out.print("> " + counter + " ");
							System.out.println(stringBuilder);
							Thread.sleep(500);
						}
					} catch (InterruptedException e) {
						logger.error(e);
					}
				} // end of synchronizing
			}
		}.start();
		Thread.sleep(100);
		while (BufferThread.counter++ < 6) {
			System.out.print("< " + counter + " ");
			stringBuilder.append("B");
			System.out.println(stringBuilder);
		}
	}
}
