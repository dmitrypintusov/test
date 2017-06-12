package by.pintusov.ocaExam;

import java.util.Arrays;

public class TestClass {


	public static void main(String[] args) {
		int [] a = {100001, 2, 3};

		System.out.println(Arrays.stream(a).allMatch(x -> x>= -10000 & x<=10000));
	}
}