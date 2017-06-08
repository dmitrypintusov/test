package by.pintusov.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Project: Test
 * Created by: USER
 * Date: 12.05.17.
 */
public class Runner {

	public static void main(String[] args) {

		//1. Default interface
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		System.out.println(formula.calculate(100)); //100
		System.out.println(formula.sqrt(16)); //4

		//2. lambda
		List <String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});

		// lambda sorting
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);

		// 3. Functional interface
		Converter <String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted); // 123

		//4. Reference to method
		Converter <String, Double> doubleConverter = Double::valueOf;
		Double doubleConverted = doubleConverter.convert("12.50");
		System.out.println(doubleConverted);

		//4. Reference to method
		Something something = new Something();
		Converter <String, String> stringConverter = something::startWith;
		String stringConverted = stringConverter.convert("Java");
		System.out.println(stringConverted); // J

		//4. Reference to constructor
		PersonFactory personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker"); //compiler auto choose constructor to use
		System.out.println(person);
	}
}
