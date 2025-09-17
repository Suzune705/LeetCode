import java.io.*;
import java.util.*;

public class problem_2798 {
	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int kq = 0 ;
		for (int x : hours) {
			if (x >= target) {
				kq++;
			}
		}
		return kq ;
	}
	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4};
		int tmp = 2;
		System.out.print(numberOfEmployeesWhoMetTarget(a, tmp));
	}
}