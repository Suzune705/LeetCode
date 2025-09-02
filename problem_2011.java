import java.io.*;
import java.util.*;

public class problem_2011 {

	public static int finalValueAfterOperations(String[] operations) {
		int x = 0 ;
		for (String s : operations) {
			if (s.equals("--X") && s.equals("X--")) {
				--x ;
			} else {
				x++ ;
			}
		}
		return  x;
	}
	public static void main(String[] args) {
		String[] tmp = {"--X", "X++" , "X++"};
		System.out.println(finalValueAfterOperations(tmp));
	}
}