package com.valtech.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMountain {
	public static boolean containsAscendingAndDescending(List<Integer> arr) {
		boolean ascending = false;
		boolean descending = false;
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) > arr.get(i - 1)) {
				ascending = true;
			} else if (arr.get(i) < arr.get(i - 1)) {
				descending = true;
			}
			if (ascending && descending) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4);
		boolean result = containsAscendingAndDescending(arr);
		if (result) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}

	}

}
