package TanXin;

import java.util.Arrays;

public class P455 {
    public static void main(String[] args) {
        int g [] = {4,5,6,1,3,4};
        int s [] = {2,4,5,7,6,5,4};
        int ch = 0, co = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (ch<g.length && co<s.length){
            if (g[ch]<=s[co]){
                ch++;
            }
            co++;
        }
        System.out.println(ch);
    }
}
