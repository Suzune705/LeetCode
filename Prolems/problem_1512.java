import java.io.*;
import java.util.*;

public class problem_1512 {

	public static int numIdenticalPairs(int[] nums) {
		int pair = 0 ;
		for (int i = 0 ; i < nums.length ; i++) {
			for (int j = 0 ; j < nums.length ; j++) {
				if (nums[i] == nums[j] && i < j ) {
					pair++ ;
				}
			}
		}
		return pair ;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1, 1, 3};
		System.out.print(numIdenticalPairs(a));
	}
}