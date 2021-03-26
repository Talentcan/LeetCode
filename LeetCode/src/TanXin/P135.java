package TanXin;

public class P135 {
    public static void main(String[] args) {
     int ratings [] = {1,2,87,87,87,2,1};
     int arr [] = new int[ratings.length];
     for (int i=0 ; i<arr.length ; i++){
         arr[i] = 1 ;
     }
     for (int i=0 ; i<arr.length-1 ; i++){
         if(ratings[i+1] > ratings[i])
             arr[i+1] = arr[i]+1;
     }
     for (int i=arr.length-1 ; i>0 ; i--){
         if (ratings[i-1]>ratings[i] && arr[i-1]<=arr[i])
             arr[i-1] = arr[i]+1;
     }
     int sum = 0;
     for (int i=0 ; i<arr.length ; i++){
         sum += arr[i];
     }
        System.out.println(sum);
    }
}
