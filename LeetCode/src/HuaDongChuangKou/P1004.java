package HuaDongChuangKou;

public class P1004 {
    public static void main(String[] args) {
        int [] A = {0,0,0,0,1,1,0,0,1,0,1,1,0,0,0,1,1,1,0,};
        int K = 3;
        int right = 0,left = 0,zeronums = 0;
        int res=0;
        while (right < A.length){
            if(A[right] == 0){
                zeronums++;
            }
            while(zeronums > K){
                if(A[left++]==0){
                    zeronums--;
                }
            }
            res = Math.max(res,right-left+1);
            right++;
        }
        System.out.println(res);
    }
}
