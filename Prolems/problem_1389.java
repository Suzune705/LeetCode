import java.io.*;
import java.util.*;

public class problem_1389 {

	public static int[] createTargetArray(int[] nums, int[] index) {
		// 9/62 test passed
		int[] target = new int[nums.length];
		boolean[] check = new boolean[nums.length];
		for (int i = 0 ; i < index.length ; i++) {
			int value_i = index[i];
			if (check[value_i] == false) {
				target[value_i] = nums[i];
				check[value_i] = true ;
			} else {
				for (int j = i ; j >= value_i ; j--) {
					target[j] = target[j - 1];
				}
				target[value_i] = nums[i];
			}
		}
		return target;
	}

	public static int solved(int[] nums , int[] index) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0 ; i < index.length ; i++) {
			int value_i = index[i];
			list.add(value_i, nums[i]);
		}
		int[] target = new int[list.size()];
		for (int i = 0 ; i < list.size() ; i++ ) {
			target[i] = list.get(i);
		}
		return target;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 0};
		int[] index = {0, 1, 2, 3, 0};
		for (int x : createTargetArray(nums, index)) {
			System.out.print(x + " ");
		}
	}
}