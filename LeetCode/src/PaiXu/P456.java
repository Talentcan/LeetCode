package PaiXu;

public class P456 {
    public static void main(String[] args) {
        int nums [] = {1,2,5,6,3,4,4,5,6,7,5,3,14,5,6,};
        for(int i=0 ; i<=nums.length-3 ; i++){
            if (nums[i] < nums[i+1] && nums[i+1] > nums[i+2] && nums[i]<nums[i+2])
                System.out.println(true);
        }
    }

}
