import java.io.*;
import java.util.*;

public class problem_2418 {

	public static void swap(int a , int b , int[] tmp) {
		int res = tmp[a] ;
		tmp[a] = tmp[b];
		tmp[b] = res ;
	}
	public static void swapChar(int a , int b , String[] arr) {
		String res = arr[a] ;
		arr[a] = arr[b];
		arr[b] = res ;
	}
	public static String[] sortPeople(String[] names, int[] heights) {
		for (int i = 0 ; i < heights.length - 1; i++) {
			int max = i ;
			for (int j = i + 1 ; j < heights.length ; j++) {
				if (heights[j] >  heights[max]) {
					max = j ;
				}
			}
			swap(i , max , heights );
			swapChar(i , max , names);
		}
		return names;
	}
	public static void main(String[] args) {
		String[] a = {"Mary", "John", "Emma"};
		int[] b = {180, 165, 170};
		sortPeople(a, b);
		// for (String x : sortPeople(a, b)) {
		// 	System.out.print(x);
		// }
	}
}