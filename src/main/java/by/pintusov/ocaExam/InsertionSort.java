package by.pintusov.ocaExam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project: Test
 * Created by: USER
 * Date: 08.06.17.
 */
public class InsertionSort {

	public static void main(String[] args) {
		Integer arr [] = initializeArray();
		insertionSort(arr);
	}

	public static void insertionSort(Integer[] elems) {

		if (elems != null & Arrays.stream(elems).allMatch(x -> x>= -10000 & x<=10000)) {

			FIRST_LOOP : for (int i = 1; i < elems.length; i++) {

				SECOND_LOOP: for (int j = i; j > 0 && elems[j-1] > elems [j]; j --) {
					int temp = elems[j-1];
					elems[j-1] = elems[j];
					elems[j] = temp;
				}

				Arrays.stream(elems).forEach(System.out::print);
				System.out.print("\n");
			}
		} else {
			System.out.println(ELEMENTS_CHECK_FAIL);
		}
	};

	public static Integer [] initializeArray () {
		Integer arr[] = null;

		try (Scanner scanner = new Scanner(System.in)) {
			String elem = scanner.nextLine();

			if (Integer.parseInt(elem) >= 1 && Integer.parseInt(elem) <= 1000) {
				arr = Arrays.stream(scanner.nextLine().split(" "))
						.map(Integer::valueOf).toArray(Integer[]::new);
				return arr;
			} else {
				System.out.println(INITIALIZE_CHECK_FAIL);
			}

			return arr;
		}
	};

	private static final String INITIALIZE_CHECK_FAIL = "Please, initialize array from 1 to 1000 elements.";
	private static final String ELEMENTS_CHECK_FAIL = "Please, check if array contain any elements and/or elements from -10000 to 10000.";

		/*6
		1 4 3 5 6 2

		1 4 3 5 6 2
		1 3 4 5 6 2
		1 3 4 5 6 2
		1 3 4 5 6 2
		1 2 3 4 5 6*/
}


