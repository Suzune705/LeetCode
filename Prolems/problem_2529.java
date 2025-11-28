import java.io.*;
import java.util.*;

public class problem_2529 {

	public static int maximumCount(int[] nums) {
		int cnt = 0 ;
		int neg = 0 , pos = 0 ;
		for (int x : nums) {
			if (x > 0) pos++ ;
			if (x < 0 ) neg++;
		}
		return Math.max(pos, neg);
	}
	public static void main(String[] args) {
		int[] a = { -2, -1, -1, 1, 2, 3};
		System.out.print(maximumCount(a));
	}
}