package PaiXu;

import sun.security.util.Length;

import java.util.Arrays;

public class Simple1502 {
    public static void main(String[] args) {
        int [] arr = {3,5,2,6,1};
        Arrays.sort(arr);
//        for (int i=0 ; i<arr.length ; i++){
//            for (int j=0 ; j<arr.length-1 ; j++){
//                if (arr[j] > arr[j+1]){
//                    int swap = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = swap;
//                }
//            }
//        }
        boolean res = true;
        for (int i=0 ; i<arr.length-2 ; i++){
            if (arr[i+1]-arr[i] != arr[i+2]-arr[i+1]){
                res = false;
            }
        }
        System.out.println(res);
    }
}
