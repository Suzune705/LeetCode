import java.io.*;
import java.util.*;

public class problem_1816 {
	public static String truncateSentence(String s, int k) {
		int cnt = 0 ;
		String res =  " ";
		StringBuilder sb = new StringBuilder(res);
		String[] tmp = s.split("\s++");
		for (String x : tmp) {
			if (cnt < k) {
				sb.append(x + " ");
				cnt++;
			}
		}

		return sb.toString().trim();
	}
	public static void main(String[] args) {
		String s = "What is the solution to this problem";
		int k = 4 ;
		System.out.print(truncateSentence(s, k));
	}
}