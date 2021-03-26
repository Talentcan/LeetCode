package PaiXu;

public class Simple1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] a = {4,5,6,7,0,2,1,3};
        char [] c = new char[a.length];
        for (int i=0 ; i<a.length ; i++){
            c[a[i]] = s.charAt(i);
        }
        String s1 = "";
        for (int i=0 ; i<a.length ; i++){
            s1 = s1 + c[i] + "";
        }
        System.out.println(s1);
    }
}
