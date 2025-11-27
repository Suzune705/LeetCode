import java.io.*;
import java.util.*;

public class problem_704 {

	public static int search(int[] nums, int target) {
		int left = 0 , right = nums.length - 1 ;
		while (left <= right) {
			int mid = (left + right) / 2 ;
			if (nums[mid] == target) return mid;
			else if (target < nums[mid]) {
				right = mid - 1 ;
			} else {
				left = mid + 1;
			}
		}
		return -1 ;
	}
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 9};
		int target = 9 ;
		System.out.print(search(a, target));
	}
}