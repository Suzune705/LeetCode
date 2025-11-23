

import java.io.*;
import java.util.*;

public class problem_Contest477_Q1 {
	public static Long sumAndMultiply(int n) {
		if (n == 0 ) return Long.valueOf(0) ;
		String tmp = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < tmp.length() ; i++) {
			if (tmp.charAt(i) != '0') {
				sb.append(tmp.charAt(i));
			}
		}
		long a = Long.parseLong(sb.toString());
		int sum = 0 ;
		for (int i = 0 ; i < sb.length() ; i++) {
			sum += sb.charAt(i) - '0';
		}
		return a * sum ;
	}
	public static void main(String[] args) {
		int n = 0 ;
		// sumAndMultiply(n);
		System.out.print(sumAndMultiply(n));
	}
}