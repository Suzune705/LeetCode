import java.io.*;
import java.util.*;



// accounts.length : the number row of i ( m )
// accounts[i].length : the number column of i  ( n )
public class problem_1672 {

	public static int maximumWealth(int[][] accounts) {
		int wealth = 0 ;
		for (int i = 0 ; i < accounts.length  ; i++) {
			int sum = 0 ;
			for (int j = 0 ; j < accounts[i].length ; j++) {
				sum += accounts[i][j];
			}
			wealth = Math.max(wealth, sum);
		}
		return wealth;
	}
	public static void main(String[] args) {
		int[][] a = {
			{1, 5,},
			{7, 3 , 3},
			{3, 5 , 2}
		};
		System.out.print(maximumWealth(a));
	}
}