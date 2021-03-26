package TanXin;

import sun.security.util.Length;

import java.util.ArrayList;

public class P605 {
    public static void main(String[] args) {
        int flowerbed [] = {0,0,0};
        int n = 5;
        String s = "";
        for (int i=0 ; i<flowerbed.length ; i++){
            s = s+flowerbed[i];
        }
        String [] res = s.split("1");
        int [] a = new int [res.length];
        for (int i=0 ; i<res.length ; i++){
            a[i] = res[i].length();
        }
        int sum = 0;
        if (!s.contains("1")){
            if(s.length()%2 == 0)
                sum =s.length()/2;
            else
                sum =s.length()/2 + 1;
        }
        else{
            if (s.indexOf('1') != 0 ){
                sum = sum+s.indexOf('1')/2;
                a[0]=0;
            }
            if (s.lastIndexOf('1') != s.length()-1){
                sum = sum + ((s.length()-1-s.lastIndexOf('1'))/2);
                a[a.length-1]=0;
            }
            for (int i=0 ; i<a.length ; i++){
                if (a[i] <=2)
                    continue;
                else if(a[i]%2 == 0)
                    sum = sum + a[i]/2-1;
                else
                    sum = sum + a[i]/2;
            }
        }

        System.out.println(sum);
    }
}
