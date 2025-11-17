import java.io.*;
import java.util.*;

public class problem_3194 {


	public static void minimumAverage(int[] nums) {
		List<Integer> list = new ArrayList();
		for (int i = 0 ; i < nums.length ; i++) {
			list.add(nums[i]);
		}
		Collections.sort(list);
		int t = nums.length / 2 ;
		int max = 0 , min = 800;
		double avg = 0 ;
		List<Double> list2 = new ArrayList<>();
		while (t >= 1) {
			avg = ((double)list.get(0) + list.get(list.size() - 1) ) / (double)2;
			list2.add(avg);
			list.remove(0);
			list.remove(list.size() - 1);
			t--;
		}
		Collections.sort(list2);
		return list2.get(0);
		// System.out.print(list2.get(0));
	}
	public static void main(String[] args) {
		int[] a = {7, 8, 3, 4, 15, 13, 4, 1};
		minimumAverage(a);
		// System.out.print(minimumAverage(a));
	}
}
