package TanXin;

import java.util.Arrays;
import java.util.Comparator;

public class P452 {
    public static void main(String[] args) {
        int points [][] = {{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(points, (a,b) -> a[1] > b[1] ? 1 : -1);
        int count = 1;
        int a = points[0][1];
        for (int i=1 ; i<points.length ; i++){
            if(a < points[i][0]){
                ++count;
                a = points[i][1];
            }
        }
        System.out.println(count);
    }
}
