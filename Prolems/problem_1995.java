import java.io.*;
import java.util.*;

public class problem_1995 {
	public static int countQuadruplets(int[] nums) {
		int cnt = 0 ;
		for (int a = 0 ; a < nums.length - 1 ; a++) {
			for (int b = a + 1 ; b < nums.length; b++) {
				for (int c = b + 1 ; c < nums.length ; c++) {
					for (int d = c + 1 ; d < nums.length ; d++) {
						if (nums[a] + nums[b] + nums[c] == nums[d]) {
							cnt++;
						}
					}
				}
			}
		}
		return cnt ;
	}
	public static void main(String[] args) {
		int[] a = {1, 1 , 1 , 3 , 5};
		System.out.print(countQuadruplets(a));
	}
}