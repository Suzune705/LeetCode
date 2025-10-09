import java.io.*;
import java.util.*;

public class problem_2974 {

	// passed but too slow cause i'm overthinking
	public static int[] numberGame(int[] nums) {
		Arrays.sort(nums);

		int[] tmp = new int[nums.length];
		int j = 0 ;
		for (int i = 0 ; i <= nums.length - 1  ; i += 2) {
			int a = nums[i];
			int b = nums[i + 1];
			tmp[j] = b ;
			tmp[j + 1] = a ;
			j += 2 ;
		}
		return tmp ;
	}

	public static int[] solve(int[] nums2) {
		Arrays.sort(nums2);
		for (int i = 0 ; i <= nums2.length - 1; i += 2) {

			int tmp = nums2[i] ;
			// System.out.println(tmp);
			nums2[i] = nums2[i + 1];
			nums2[i + 1] = tmp ;
		}
		return nums2 ;
	}
	public static void main(String[] args) {
		int[] a = {3 , 2 , 4, 5};
		for (int x : solve(a)) {
			System.out.print(x + " ");
		}
	}
}


