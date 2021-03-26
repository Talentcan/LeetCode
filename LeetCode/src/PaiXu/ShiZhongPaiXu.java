package PaiXu;

public class ShiZhongPaiXu {
    public static void main(String[] args) {
        int [] arr = {3,5,2,4,1};
        maopao(arr);
        System.out.println();
        xuanze(arr);
        System.out.println();
        charu(arr);

    }

    private static void charu(int[] arr) {
        for (int i=0 ; i<arr.length ; i++){
            int num = arr[i+1];

        }
    }

    private static void xuanze(int[] arr) {
        for (int i=0 ; i<arr.length ; i++){
            int index = i;
            for (int j=i ; j<arr.length-1 ; j++){
                if (index > arr[j]){
                    index = j;
                }
            }
            int swap = arr[index];
            arr[index] = arr[i];
            arr[i] = swap;
        }
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }

    private static void maopao(int[] arr) {
        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length-1 ; j++){
                if (arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
