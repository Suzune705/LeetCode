import java.io.*;
import java.util.*;

public class sliding_window {
	public static void main(String[] args) {
		int[] a = {4 , 3 , 1, 2 , 8 , 6 , 10 , 1};
		int sum = 0 , k = 3 , cnt ;
		for (int i = 0 ; i < k ; i++) {
			sum += a[i] ;
		}
		int kyluc = sum ;
		for (int i = k ; i < a.length ; i++) {
			sum = sum - a[i - k] + a[i];
			if (sum > kyluc) {
				kyluc = sum ;
			}
		}
		System.out.print(kyluc);
	}
}