package by.pintusov.ocaExam;

import java.util.Scanner;

/**
 * Project: Test
 * Created by: USER
 * Date: 08.06.17.
 */
public class InsertionSort {

	public static void printArray (int [] arr) {
		for (int element: arr) {
			System.out.printf("%d ", element);
		}
		System.out.println();
	}

	public static void sortArray (int [] elems) {

		for(int i = elems.length-1; i  >= 0; i--) {
			int valueToSort = elems[i];
			int j = i - 1;
			while (j >= 0 && elems[j] > valueToSort) {
				elems[j+1] = elems [j];
				printArray(elems);
				j--;
			}
			elems[j + 1] = valueToSort;
			printArray(elems);
/*			if (elems[j+1] > valueToSort) {
				return;
			}*/
		}
	}

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final int elemNumber = in.nextInt();

		final int[] elems = new int[elemNumber];
		for(int i = 0; i < elemNumber; i++) {
			elems[i] = in.nextInt();
		}
		in.close();

		sortArray(elems);
	}
}
