import java.io.*;
import java.util.*;

public class problem_747 {

	public static int dominantIndex(int[] nums) {
		int max = -1 ;
		int idx = 0 ;
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i] > max) {
				max = nums[i];
				idx = i ;
			}
		}
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i] != max && nums[i] != 0 ) {
				if (max / nums[i] < 2 ) {
					return -1;
				}
			}
		}
		return idx ;
	}


	public static void main(String[] args) {
		int[] num = {3, 6 , 1 , 0 };
		System.out.print(dominantIndex(num));
	}
}
