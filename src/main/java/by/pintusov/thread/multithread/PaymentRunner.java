package by.pintusov.thread.multithread;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class PaymentRunner {
	private static Logger logger = Logger.getLogger(PaymentRunner.class);

	public static void main(String[] args) throws InterruptedException {
		final Payment payment = new Payment();
		new Thread () {
			public void run () {
				payment.doPayment();
			}
		}.start();
		Thread.sleep(200);

		synchronized (payment) {
			System.out.println("Init amount:");
			payment.initAmount();
			payment.notify();
		}

		synchronized (payment) {
			payment.wait(1_000);
			System.out.println("ok");
		}
	}
}
