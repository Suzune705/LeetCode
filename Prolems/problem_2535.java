import java.io.*;
import java.util.*;



public class problem_2535 {

	public static int split(int x) {
		int sum = 0 ;
		while (x > 0 ) {
			int tmp = x % 10 ;
			sum += tmp ;
			x /= 10 ;
		}
		return sum ;
	}

	public static int differenceOfSum(int[] nums) {
		int elementSum = 0 ;
		int digit = 0  ;
		for (int x : nums) {
			elementSum += x ;
			if (x >= 10 ) {
				digit += split(x);
			} else {
				digit += x ;
			}
		}
		return  Math.abs(elementSum - digit);
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 8, 10, 8, 10, 1, 10, 5, 9};
		// System.out.print(split(15));
		System.out.print(differenceOfSum(nums));
	}
}