import java.io.*;
import java.util.*;

public class Q1_Contest481 {
	public static int reverse(int n ) {
		int res = 0 ;
		while (n > 0  ) {
			int tmp = n % 10 ;
			res = res * 10 + tmp ;
			n /= 10 ;
		}
		return res ;
	}
	public static int mirrorDistance(int n) {
		// int reverse = reverse(n);
		// System.out.print(reverse(n));
		return Math.abs(n - reverse(n));
	}
	public static void main(String[] args) {
		int n = 25 ;
		System.out.print(mirrorDistance(n));
	}
}