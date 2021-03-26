package TanXin;

import java.util.Arrays;
import java.util.Comparator;

public class P435 {
    public static void main(String[] args) {
        int intervals [][] = {{1,2},{2,3},{3,4}};
        if (intervals == null)
            System.out.println("no");
        Arrays.sort(intervals, new Comparator<int[]>() {  //重写comparator构造
            public int compare(int[] a, int[] b) {    //a[1]-b[1]是升序      b[1]-a[1]是降序
                return a[1] - b[1];
            }
        });
        //Arrays.sort(intervals,(a,b)->a[1]-b[1]); 可以这样写
        int count = 1;
        int a = intervals[0][1];
        for (int i=1 ; i<intervals.length ; i++){
            if(a <= intervals[i][0]){
                a = intervals[i][1];
                ++count;
            }
        }
        System.out.println(intervals.length-count);
    }
}
