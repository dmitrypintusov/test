package by.pintusov;

import by.pintusov.thread.Broker;
import by.pintusov.thread.Market;
import org.apache.log4j.Logger;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Project: Test
 * Created by: USER
 * Date: 30.03.17.
 */
public class MarketLoader {
	private static Logger logger = Logger.getLogger(MarketLoader.class);
	private static final int NUMBER_BROKERS = 5;

	public static void main(String[] args) {
		Market market = new Market(new AtomicLong(100));
		market.start ();
		for (int i = 0; i < NUMBER_BROKERS; i++) {
			new Broker(market).start();
		}
	}
}
