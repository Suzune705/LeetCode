import java.io.*;
import java.util.*;



public class problem_2367 {
	// O n^3
	public static int arithmeticTriplets(int[] nums, int diff) {
		int cnt = 0 ;
		for (int i = 0 ; i < nums.length - 2 ; i++) {
			for (int j = i + 1 ; j < nums.length - 1 ; j++) {
				for (int k = j + 1 ; k < nums.length ; k++) {
					if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff ) {
						cnt++;
					}
				}
			}
		}
		return cnt ;
	}

// 0(n)
	public static int optimize(int[] nums, int diff) {
		Map<Integer, Integer> map = new HashMap<>();
		int i = 0 ;
		for (int x : nums) {
			map.put(x , i++);
		}
		int cnt = 0 ;
		for (int x : nums) {
			if (map.containsKey(x + diff) && map.containsKey(x + 2 * diff)) { // check j and k is exist in map ?
				cnt++;
			}
		}
		return cnt ;
	}
	public static void main(String[] args) {
		int[] a = {0 , 1 , 4, 6 , 7 , 10};
		System.out.print(arithmeticTriplets(a, 3));
	}
}