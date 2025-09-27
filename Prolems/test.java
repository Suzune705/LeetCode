import java.io.*;
import java.util.*;

public class test {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int widest = 0 ;
        Set<Integer> set = new TreeSet<>();
        for (int a = 0 ; a < points.length ; a++) {
            Integer tmp = points[a][0];
            set.add(tmp);
        }
        Iterator<Integer> it = set.iterator();
        int head = 0 , prev ;
        int cnt = 0 ;
        while (it.hasNext()) {
            prev = head ;
            head = it.next();
            cnt++ ;
            if (cnt >= 2) {
                widest = Math.max(widest, head - prev);
            }
        }
        return widest ;
    }

    public static void main(String[] args) {
        int[][] x = {
            {8, 7},
            {9, 9},
            {7, 4},
            {9, 7}
        };
        System.out.println(maxWidthOfVerticalArea(x));
    }
}