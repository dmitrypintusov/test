package by.pintusov.thread.multithread;


import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Project: Test
 * Created by: USER
 * Date: 11.05.17.
 */
public class Payment {
	private int amount;
	private boolean close;
	private static Logger logger = Logger.getLogger(Payment.class);

	public int getAmount () {
		return amount;
	}

	public boolean isClose () {
		return close;
	}

	public synchronized void doPayment () {
		try {
			System.out.println("Start payment:");
			while (amount <= 0) {
				this.wait();
			}
			close = true;
		} catch (InterruptedException e) {
			logger.error(e);
		}
		System.out.println("Payment is closed: " + close);
	}

	public void initAmount () {
		Scanner scanner = new Scanner (System.in);
		amount = scanner.nextInt();
	}
}
