
import java.io.*;
import java.util.*;

public class problem_205 {
	public static boolean isIsomorphic(String s, String t) {
		Map < Character, Integer> map1 = new HashMap<>();
		Map< Character, Integer> map2 = new HashMap<>();
		for (int i = 0 ; i < s.length() ; i++) {
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			if (!map1.containsKey(s1)) {
				map1.put(s1, i);
			}
			if (!map2.containsKey(t1)) {
				map2.put(t1, i );
			}
			if (!map1.get(s1).equals(map2.get(t1))) {
				return false;
			}
		}
		return true ;
	}
	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		if (isIsomorphic(s, t)) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}
}