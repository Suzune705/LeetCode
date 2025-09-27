import java.io.*;
import java.util.*;

public class problem_2942 {

	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> tmp = new ArrayList<>();
		for (int i = 0 ; i < words.length ; i++) {
			String s = words[i];
			for (int j = 0 ; j < s.length() ; j++) {
				if (s.charAt(j) == x) {
					tmp.add(i);
					break;
				}
			}
		}
		return tmp ;
	}

	public static void main(String[] args) {
		char x = 'e';
		String[] s = {"leet", "code"};
		List<Integer> tmp = findWordsContaining(s, x);
		System.out.print(tmp);
	}
}