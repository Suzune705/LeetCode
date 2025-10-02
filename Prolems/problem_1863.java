
import java.io.*;
import java.util.*;

public class problem_1863 {

	public static void subsetXORSum(int[] nums) {
		int xor1 =  0;
		int sum = 0 ;
		for (int i = 0 ; i < nums.length; i++) {
			for (int j = i + 1 ; j < nums.length ; j++) {
				xor1 += nums[i] ^ nums[j];
			}
			sum += nums[i] ;
		}
		System.out.print(sum);
		System.out.print(xor1);
		int tmp = 0 ;
		for (int x : nums) {
			tmp = tmp ^ x ;
		}
		// return sum + xor1 + tmp ;
		System.out.print(tmp);
	}
	public static void main(String[] args) {
		int[] tmp = {1, 3 };
		subsetXORSum(tmp);
		// System.out.print(subsetXORSum(tmp));
	}
}