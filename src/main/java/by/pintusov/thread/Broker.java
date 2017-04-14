package by.pintusov.thread;

import org.apache.log4j.Logger;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */
public class Broker extends Thread {
	private static Logger logger = Logger.getLogger(Broker.class);
	private Market market;
	private static final int PAUSE = 500;

	public Broker (Market market) {
		this.market = market;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Current index: " + market.getIndex());
				Thread.sleep(PAUSE);
			}
		} catch (InterruptedException e) {
			logger.error(e);
		}
	}
}
