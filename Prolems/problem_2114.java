import java.io.*;
import java.util.*;

public class problem_2114 {
	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for (int i = 0 ; i < sentences.length ; i++) {
			String[] x = sentences[i].split(" ");
			if (x.length > max) {
				max = x.length;
			}
		}
		return max ;
	}
	public static void main(String[] args) {
		String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.print(mostWordsFound(s));
	}
}