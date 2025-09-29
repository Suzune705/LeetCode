import java.io.*;
import java.util.*;

public class problem_1480 {
	public static void main(String[] args) {
		int[] n = {1, 2 , 3 , 4};
		int sum = 0 ;
		int[] result = new int[n.length];
		int j = 0 ;
		for (int i = 0 ; i < n.length ; i++) {
			sum += n[i];
			result[j] = sum ;
			j++;
		}
		for (int x : result ) {
			System.out.print(x + " ");
		}
	}
}