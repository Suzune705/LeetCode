import java.io.*;
import java.util.*;

public class problem_3065 {
    public static  int minOperations(int[] nums, int k) {
        int operation = 0 ;
        for (int x : nums) {
            if (x < k) {
                operation++ ;
            }
        }
        return operation ;
    }
    public static void main(String[] args) {

    }
}