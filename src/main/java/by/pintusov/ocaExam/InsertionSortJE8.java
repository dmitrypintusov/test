package by.pintusov.ocaExam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project: Test
 * Created by: USER
 * Date: 12.06.17.
 */
public class InsertionSortJE8 {

		public static void main(String... args){
			try(Scanner scan = new Scanner(System.in)){
				scan.nextLine();
				Integer[] arr = Arrays.stream(scan.nextLine().split(" ")).
						map(Integer::valueOf).toArray(Integer[]::new);

				insertionSort(arr);
			}
		}

	public static void insertionSort(Integer[] arr){
		int ind = arr.length - 1;
		final int last = arr[ind];

		while(ind-- >= 0){
			System.out.print("\n");

			if(ind < 0 || last > arr[ind]){
				arr[ind + 1] = last;
				ind = -1;
			}else{
				arr[ind + 1] = arr[ind];
			}

			Arrays.stream(arr).forEach(System.out::print);
		}
	}
}
