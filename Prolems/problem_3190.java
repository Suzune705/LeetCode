import java.io.*;
import java.util.*;

public class problem_3190 {

	public static int minimumOperations(int[] nums) {
		int operation = 0 ;
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i] % 3 != 0 ) {
				operation++;
			}
		}
		return operation;
	}

// way 2

	public static solve2(int[] nums) {
		int operation = 0 ;
		for (int i = 0 ; i < nums.length ; i++) {

		}
	}
	public static void main(String[] args) {
		int[] a = {1 , 2 , 3, 4};
		System.out.println(minimumOperations(a));
	}
}