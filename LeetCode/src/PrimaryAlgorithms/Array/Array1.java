package PrimaryAlgorithms.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Array1 {
    public static void main(String[] args) {
        int [] nums = {-3,-1,0,0,0,0,3,3};
        jisuan a = new jisuan();
        int b = a.removeDuplicates(nums);
        System.out.println();
        for (int i=0 ; i<b ; i++){
            System.out.print(nums[i]);
        }
    }
}

class jisuan{
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }
        Integer[] arr = (Integer[])set.toArray(new Integer[set.size()]);
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i].intValue() + " ");

        }
        for (int i=0 ; i<arr.length ; i++){
            nums[i] = arr[i].intValue();
        }
        return arr.length;
    }
}
