package PaiXu;

import java.util.Arrays;

public class P1033 {
    public static void main(String[] args) {
        int a [] = {1,2,5};
        int b [] = new int[2];
        Arrays.sort(a);
        if (a[1] - a[0] == 1){
            if (a[2]-a[1] == 1){
                b[0]=0;
                b[1]=0;
            }
            else {
                b[0]=1;
                b[1]=a[2]-a[1]-1;
            }
        }
        else{
            if (a[2]-a[1] == 1){
                b[0]=1;
                b[1]=a[1] - a[0]-1;
            }
            else{
                b[0]=2;
                b[1]=(a[1]-a[0]-1) + (a[2]-a[1]-1);
            }
        }
        System.out.println(b[0] + " " +b[1]);
    }
}
