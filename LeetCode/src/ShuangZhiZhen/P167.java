package ShuangZhiZhen;

public class P167 {
    public static void main(String[] args) {
        int [] numbers = {-1,1,2,4,6,9,11};
        int target = 0;
        int res [] = new int [2];
        for (int i=0 ; i<numbers.length-1 ; i++){
            for (int j=i+1 ; j<numbers.length ; j++){
                if (numbers[i] + numbers[j] == target){
                    res[0] = i+1;
                    res[1] = j+1;
                }
            }
        }
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if (numbers[r] + numbers[l] == target)
                break;
            else if(numbers[r] + numbers[l] < target)
                l++;
            else
                r--;
        }
        System.out.println(res[0] + " " + res[1]);
        System.out.println(l+1 + " " + (r+1));
    }
}
