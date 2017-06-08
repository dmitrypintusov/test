package by.pintusov.java8;

/**
 * Project: Test
 * Created by: USER
 * Date: 12.05.17.
 */
interface PersonFactory <P extends Person> {
	P create (String firstName, String lastName);
}
