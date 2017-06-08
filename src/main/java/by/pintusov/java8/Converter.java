package by.pintusov.java8;

/**
 * Project: Test
 * Created by: USER
 * Date: 12.05.17.
 */
@FunctionalInterface
public interface Converter <T, K> {

	K convert (T from);
}
