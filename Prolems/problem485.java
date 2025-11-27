import java.io.*;
import java.util.*;

public class problem485 {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int cnt = 0 ;
		int max = 0;
		int tmp = 1 ;
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i] == tmp) {
				cnt++;
				if (cnt >= max) max = cnt ;
			} else {
				cnt = 0 ;
			}
		}
		return max ;
	}
	public static void main(String[] args) {
		int[] a = {1, 1, 0 , 1, 1 , 1};
		System.out.print(findMaxConsecutiveOnes(a));
	}
}