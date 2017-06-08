package by.pintusov.java8;

/**
 * Project: Test
 * Created by: USER
 * Date: 12.05.17.
 */
public interface Formula {

	double calculate (int a);

	default double sqrt (int a) {
		return Math.sqrt(a);
	}
}
