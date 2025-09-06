import java.io.*;
import java.util.*;

public class problem_1470 {

	public static int[] shuffle(int[] nums, int n) {

		int left = 0 , right = nums.length / 2 ;
		int[] tmp = new int[2 * n];
		int indexL = 2 , indexR = 3 ;
		tmp[0] = nums[left];
		tmp[1] = nums[right];
		while (left < n - 1 ) {
			++left;
			tmp[indexL] = nums[left];
			++right;
			tmp[indexR] = nums[right];
			indexL += 2;
			indexR += 2;
		}
		return tmp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {2, 5 , 1 , 3 , 4 , 7} ;
		int n = 3 ;
		for (int x : shuffle(a, n)) {
			System.out.print(x);
		}
	}
}