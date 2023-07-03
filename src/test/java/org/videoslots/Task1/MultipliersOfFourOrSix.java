package org.videoslots.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipliersOfFourOrSix {

	public static void main(String[] args) {

		int[] input = { 4, 8, 12, 26, 20, 24, 28, 32 };
		int[] output = MultipliersOfFourOrSix.multiplesOfFourAndSix(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	public static int[] multiplesOfFourAndSix(int[] a) {

		int j = 0;
		ArrayList<Integer> resultList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (((a[i] % 4) == 0) || ((a[i] % 6) == 0)) {
				resultList.add(a[i]);
				j = j + 1;
			}
		}

		int[] result = new int[resultList.size()];
		Iterator<Integer> iterator = resultList.iterator();
		for (int i = 0; i < result.length; i++) {
			result[i] = iterator.next().intValue();
		}

		return result;
	}

}
