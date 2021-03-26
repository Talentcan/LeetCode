package ShuangZhiZhen;

import java.util.Arrays;

public class P88 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        for (int i=m ; i<m+n ; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.print("[");
        for (int i=0 ; i<nums1.length-1 ; i++){
            System.out.print(nums1[i] + ",");
        }
        System.out.print(nums1[nums1.length-1] + "]");
    }
}
