import java.io.*;
import java.util.*;


public class problem_2373 {

	public static int[][] largestLocal(int[][] grid) {
		int n = grid.lenght;
		int max = 0;
		for (int i = 0  ; i < n - 1 ; i++) {
			for (int j = 0 ; j < n - 1; j++) {
				max = Math.max(max , grid[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr = {
			{9, 9, 8, 1},
			{5, 6, 2, 6},
			{8, 2, 6, 4},
			{6, 2, 2, 2}
		};
		System.out.print(largestLocal(arr));
	}
}

