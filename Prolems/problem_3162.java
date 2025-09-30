import java.io.*;
import java.util.*;

public class problem_3162 {

	public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
		int cnt = 0 ;
		for (int i = 0 ; i < nums1.length ; i++) {
			int x = nums1[i];
			for (int j = 0 ; j < nums2.length ; j++) {
				int y = nums2[j] * k ;
				if (x % y == 0) {
					cnt++ ;
				}
			}
		}
		return cnt ;
	}

	public static void main(String[] args) {
		int k = 3 ;
		int[] nums1 = {1, 2, 4, 12};
		int[] nums2 = {2, 4};
		System.out.print(numberOfPairs(nums1, nums2, k));
	}
}