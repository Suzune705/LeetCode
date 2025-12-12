import java.io.*;
import java.util.*;

public class problem_2404 {
	// public static int findMax(int[] tmp, int fre, int[] arr) {
	// 	int min = 1000000;
	// 	boolean ok = false ;
	// 	for (int x : tmp) {
	// 		if (arr[x] == fre) {
	// 			ok = true ;
	// 			if (x < min) {
	// 				min = x;
	// 			}
	// 		}
	// 	}
	// 	if (ok) return min ;
	// 	return -1 ;
	// }
	public static int mostFrequentEven(int[] nums) {
		// Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[100000];
		int fre = 0 ;
		int min = 1000000 ;
		boolean check = false ;
		if (nums.length == 1) return nums[0];
		for (int x : nums) {
			if (x % 2 == 0 ) {
				check = true ;
				arr[x]++;
				if (arr[x] > fre || x < min && arr[x] == fre) {
					fre = arr[x];
					min = x ;
				}
			}
		}
		if (check) {
			return min;
		}
		return -1 ;
	}

	public static void main(String[] args) {
		int[] a = {2, 10000, 10000, 10000, 2};
		System.out.print(mostFrequentEven(a));
	}
}