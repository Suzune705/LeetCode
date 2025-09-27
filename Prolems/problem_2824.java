import java.io.*;
import java.util.*;

public class problem_2824 {

	public static int countPairs(List<Integer> nums, int target) {
		int cnt = 0 ;
		for (int i = 0 ; i < nums.size() - 1 ; i++) {
			for (int j = i + 1 ; j < nums.size() ; j++) {
				if (nums.get(i) + nums.get(j) < target) {
					++cnt ;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {

	}
}