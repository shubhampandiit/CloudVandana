package cloudvandana.java;

import java.util.Arrays;
import java.util.Random;

public class A {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			int j = getRandom(0, a.length - 1);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;

		}
		System.out.println(Arrays.toString(a));
	}

	private static int getRandom(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

}
