package ShuangZhiZhen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P26 {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,4,5,5,6};
//        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
//        return p + 1;
        System.out.println(p+1);
    }
}
