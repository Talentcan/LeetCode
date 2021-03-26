package HashSet;

import java.util.HashSet;
import java.util.Stack;

public class MyhashSetDemo {
    public static void main(String[] args) {
        String s [] = {"1","2","+","3","-","4"};
        Stack<String> stringStack = new Stack<>();
        for (int i=0 ; i<s.length ; i++){
            if (!s[i].equals("+") && !s[i].equals("-") && !s[i].equals("*") && !s[i].equals("/")) {
                stringStack.add(s[i]);
            }
            else{
                int b = Integer.valueOf(stringStack.pop());
                int a = Integer.valueOf(stringStack.pop());
                if (s[i].equals("+")){
                    String c = b+a+"";
                    stringStack.add(c);
                }
                if (s[i].equals("-")){
                    String c = a-b+"";
                    stringStack.add(c);
                }
                if (s[i].equals("*")){
                    String c = b*a+"";
                    stringStack.add(c);
                }if (s[i].equals("/")) {
                    String c = a / b + "";
                    stringStack.add(c);
                }
            }
        }
        System.out.println(stringStack.pop());
    }
}
