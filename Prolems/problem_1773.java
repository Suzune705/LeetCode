import java.io.*;
import java.util.*;

public class problem_1773 {

	public static int index(String s) {

		if (s.equals("type")) return 0 ;
		if (s.equals("color")) return 1 ;
		if (s.equals("name")) return 2 ;

		return -1 ;
	}
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int cnt =  0 ;
		int idx = index(ruleKey);
		for (List<String> outer : items) {
			if (outer.get(idx).equals(ruleValue)) {
				++cnt ;
			}
		}
		return cnt ;
	}
	public static void main(String[] args) {

		List< List<String> > items = List.of(List.of("iphone", "blue", "pixel"),
		                                     List.of("computer", "silver", "lenovo"),
		                                     List.of("phone", "gold", "iphone"));

		String ruleKey = "color";
		String ruleValue = "silver";
		System.out.print(countMatches(items, ruleKey, ruleValue));
	}
}