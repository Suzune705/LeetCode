
import java.io.*;
import java.util.*;


public class problem_2206 {

	public static boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0 ; i < nums.length ; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0 ) + 1 );
		}
		for (int x : map.values()) {
			if (x % 2 != 0 ) {
				return false;
			}
		}
		return true ;
	}

	public static void main(String[] args) {
		int[] a = {3, 2 , 3, 2, 2 , 2};
		if (divideArray(a)) System.out.print("yes");
		else System.out.print("no");
	}
}