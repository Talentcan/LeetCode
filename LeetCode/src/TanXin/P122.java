package TanXin;

import sun.security.util.Length;

import java.util.ArrayList;

public class P122 {
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        int sum=0;
        for (int i=1 ; i<prices.length ; i++) {
            if (prices[i] > prices[i - 1]) {  // 只要卖出有利可图
                sum += (prices[i] - prices[i - 1]);
            }
        }
        System.out.println(sum);
    }
}
