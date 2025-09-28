import java.io.*;
import java.util.*;

public class problems_2574 {

	public static int[] leftRightDifference(int[] nums) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int[] tmp = new int[nums.length] ;
		int j = 0 ;
		int res = 0 , res2 = 0 ;
		for (int i = 0 ; i < nums.length - 1 ; i++) {
			res += nums[i] ;
			j += 1 ;
			left[j] = res;
		}
		int b = right.length - 1;
		for (int r = nums.length - 1 ; r > 0 ; r--) {
			res2 += nums[r] ;
			b -= 1 ;
			right[b] = res2 ;
		}
		for (int x = 0 ; x < tmp.length ; x++) {
			tmp[x] = Math.abs(left[x] - right[x]);
		}
		return tmp ;
	}
	public static void main(String[] args) {
		int[] a = {10, 4 , 8, 3};
		for (int x : leftRightDifference(a)) {
			System.out.print(x + " ");
		}
	}
}