import java.io.*;
import java.util.*;

public class problem_2037 {

	//                   62/262 test case
	public static int minMovesToSeat(int[] seats, int[] students) {
		int moved = 0 ;
		Arrays.sort(seats);
		Arrays.sort(students);
		int left = 0 , right = 0 ;
		boolean[] mark = new boolean[10000];
		for (int i = 0 ; i < students.length ; i++) {
			int min = 100000;
			for (int j = 0 ; j < seats.length ; j++) {
				if (mark[j] == false) {
					int tmp = Math.abs(students[i] - seats[j]);
					if (tmp <= min ) {
						min = tmp ;
					}
				}
			}
			moved += min ;
			// System.out.println(min);
			for (int j = 0 ; j < seats.length ; j++) {
				if (Math.abs(students[i] - seats[j]) == min && mark[j] == false) {
					mark[j] = true ;
					System.out.println(j);
					break;
				}
			}
		}
		return moved ;
	}

	public int solutions(int[] seats, int[] students) {
		int moved = 0;
		Arrays.sort(seats);
		Arrays.sort(students);
		for (int i = 0; i < students.length; i++) {
			moved += Math.abs(students[i] - seats[i]);
		}

		return moved;
	}
	public static void main(String[] args) {
		int[] seats = {4, 1 , 5, 9};
		int[] students = {1, 3, 2 , 6};
		System.out.print(minMovesToSeat(seats, students));
	}
}