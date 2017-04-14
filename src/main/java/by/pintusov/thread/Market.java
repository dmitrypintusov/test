package by.pintusov.thread;

import org.apache.log4j.Logger;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */
public class Market extends Thread {
	private static Logger logger = Logger.getLogger(Market.class);
	private AtomicLong index;

	public Market (AtomicLong index) {
		this.index = index;
	}

	public AtomicLong getIndex () {
		return index;
	}

	@Override
	public void run() {
		Random random = new Random();
		try {
			while (true) {
				index.addAndGet(random.nextInt(10));
				Thread.sleep(random.nextInt(500));
				index.addAndGet(-1*random.nextInt(10));
				Thread.sleep(random.nextInt(500));
			}
		} catch (InterruptedException e) {
			logger.error(e);
		}
	}
}
